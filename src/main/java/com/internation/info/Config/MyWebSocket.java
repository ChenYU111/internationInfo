package com.internation.info.Config;

import java.util.concurrent.CopyOnWriteArraySet;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.springframework.stereotype.Component;

import com.internation.info.common.SensitiveWord;
/** 
 * websocket的具体实现类 
 * @author Angel --守护天使 
 * @version v.0.1 
 * @date 2017年11月5日 
 */  
@ServerEndpoint(value = "/websocket/{nickname}")  
@Component  
public class MyWebSocket {
	//用来存放每个客户端对应的MyWebSocket对象。  
    private static CopyOnWriteArraySet<MyWebSocket> webSocketSet = new CopyOnWriteArraySet<MyWebSocket>();  
   
    //与某个客户端的连接会话，需要通过它来给客户端发送数据  
    private Session session;  
   
    /** 
     * 连接建立成功调用的方法 
     */  
    @OnOpen  
    public void onOpen(Session session,@PathParam("nickname") String nickname) {  
        this.session = session;  
        //this.nickname = nickname; 
        webSocketSet.add(this);     //加入set中  
        System.out.println("有新连接加入！当前在线人数为" + webSocketSet.size());  
        this.session.getAsyncRemote().sendText("恭喜您成功连接上WebSocket-->当前在线人数为："+webSocketSet.size());  
    }  
   
    /** 
     * 连接关闭调用的方法 
     */  
    @OnClose  
    public void onClose() {  
        webSocketSet.remove(this);  //从set中删除  
        System.out.println("有一连接关闭！当前在线人数为" + webSocketSet.size());  
    }  
   
    /** 
     * 收到客户端消息后调用的方法 
     * 
     * @param message 客户端发送过来的消息*/  
    @OnMessage  
    public void onMessage(String message, Session session,@PathParam("nickname") String nickname) {  
    	//加载敏感词库
    	SensitiveWord sw = new SensitiveWord("CensorWords.txt");
    	sw.InitializationWork();  
    	String mes = sw.filterInfo(message); 
    	String nickName= sw.filterInfo(nickname);
    	System.out.println("来自客户端:"+nickName+"的消息:" + mes);  
        //群发消息  
    	mes=nickName+"说:"+mes;
        broadcast(mes);  
    }  
   
    /** 
     * 发生错误时调用 
     * 
     */  
    @OnError  
    public void onError(Session session, Throwable error) {  
        System.out.println("发生错误");  
        error.printStackTrace();  
    }  
   
    /** 
     * 群发自定义消息 
     * */  
    public  void broadcast(String message){  
        for (MyWebSocket item : webSocketSet) {  
               //同步异步说明参考：http://blog.csdn.net/who_is_xiaoming/article/details/53287691  
               //this.session.getBasicRemote().sendText(message);  
               item.session.getAsyncRemote().sendText(message);//异步发送消息.  
        }  
    }  
}
