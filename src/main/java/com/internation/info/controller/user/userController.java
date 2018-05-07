package com.internation.info.controller.user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.internation.info.Config.AddMD5Encode;
import com.internation.info.controller.question.questionController;
import com.internation.info.dao.IntegrationMapper;
import com.internation.info.dao.UserMapper;
import com.internation.info.model.Article;
import com.internation.info.model.Integration;
import com.internation.info.model.IntegrationExample;
import com.internation.info.model.OtherInfo;
import com.internation.info.model.Question;
import com.internation.info.model.User;
import com.internation.info.model.UserExample;
import com.internation.info.service.InfoService;
import com.internation.info.service.IntegrationService;
import com.internation.info.service.OtherInfoService;
import com.internation.info.service.QuestionService;
import com.internation.info.service.UserService;
import com.internation.info.service.professorService;
import com.internation.info.vo.articleVo;
import com.internation.info.vo.userDetailVo;

@Controller
public class userController {
	Logger logger = LoggerFactory.getLogger(userController.class);
	@Autowired
	UserMapper userMapper;
	@Autowired
	UserExample userExample;
	@Autowired
	AddMD5Encode md5Encode;
	@Autowired
	User user;
	@Autowired
	professorService professorService;
	@Autowired
	QuestionService questionService;
	@Autowired
	InfoService infoservice;
	@Autowired
	UserService userService;
	@Autowired
	InfoService infoService;
	@Autowired
	IntegrationService integrationService;
	@Autowired
	OtherInfoService otherInfoService;
	/*
	 * @Autowired User user;
	 */
	@RequestMapping(value = "/login", produces = "application/json; charset=utf-8")
	public String loginTest() {
		return "login";
	}

	@RequestMapping(value = "/loginSure", method = { RequestMethod.POST })
	public String login(String username, String password, HttpServletRequest req, Model model) {
		System.out.println("当前用户名：" + username);
		Subject currentUser = SecurityUtils.getSubject();
		logger.info("检测用户" + username + "进行登录认证。。。。。");
		if (!currentUser.isAuthenticated()) {// 用户是否已经登录
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
			token.setRememberMe(true);
			logger.info(username + "认证成功。。。");
			try {
				currentUser.login(token);// 登录成功把用户的信息放到session中
				HttpSession session = req.getSession();
				userExample.createCriteria().andUserNameEqualTo(username);
				List<User> ulist = userMapper.selectByExample(userExample);
				if (ulist != null && ulist.size() > 0) {
					int userId = ulist.get(0).getId();
					session.setAttribute("userId", userId);
					session.setAttribute("userName", ulist.get(0).getUserName());
				}
				logger.info("用户" + username + "登录认证通过");
				req.setAttribute("user", ulist.get(0));

				List<User> professorList = professorService.findProfessorList();
				List<Integration> integrationList = new ArrayList<>();
				if (professorList != null && professorList.size() > 0) {
					for (User user : professorList) {
						Integration integration = professorService.findIntegrationByUId(user.getId());
						// 比较积分大小，得到积分前五的显示
						integrationList.add(integration);
					}
					Collections.sort(integrationList);
				}
				List<userDetailVo> list = new ArrayList<>();
				if (integrationList.size() > 5) {
					int index = 0;
					for (Integration integration : integrationList) {
						if (index < 5) {
							User user = professorService.findUserByUserId(integration.getUserId());
							userDetailVo vo = new userDetailVo();
							vo.setUserName(user.getUserName());
							vo.setId(user.getId());
							list.add(vo);
						}

					}
				} else {
					for (Integration integration : integrationList) {
						User user = professorService.findUserByUserId(integration.getUserId());
						userDetailVo vo = new userDetailVo();
						vo.setUserName(user.getUserName());
						vo.setId(user.getId());
						list.add(vo);
					}
				}

				model.addAttribute("professVoList", list);
				// top10 文章
				List<Article> articlelist = infoService.findArticleBySeeCount();
				if (articlelist != null && articlelist.size() > 0) {
					int index = 0;
					List<articleVo> articleVoList = new ArrayList<>();
					for (Article ar : articlelist) {
						if (index < 10) {
							index++;
							articleVo articleVo = new articleVo();
							articleVo.setTitle(ar.getTitle());
							articleVo.setSeecount(ar.getSeecount());
							User user = userService.findUserByPKId(ar.getUid());
							articleVo.setUsername(user.getUserName());
							articleVo.setId(ar.getId());
							articleVoList.add(articleVo);
						}
					}
					model.addAttribute("articleList", articleVoList);
				
				}
				
				List<OtherInfo> list2 = otherInfoService.findOtherInfoTop10();
				List<OtherInfo> top10List = new ArrayList<>();
				int index = 0;
				if (list2 != null && list2.size() > 0) {
					if (list2.size() > 10) {
						if (index < 10) {
							for (OtherInfo otherInfo : list2) {
								index++;
								top10List.add(otherInfo);
							}
						}
					}else{
						for (OtherInfo otherInfo : list2) {
							top10List.add(otherInfo);
						}
					}
				}
				model.addAttribute("otherInfoList", top10List);
				String un = (String)req.getSession().getAttribute("username");
				model.addAttribute("username", (String)req.getSession().getAttribute("username"));
				return "main";
			} catch (AuthenticationException e) {
				System.out.println("登录失败");
			}
		} else {
			return "main";
		}
		return "login";
	}

	// 注册确定Controller
	@RequestMapping("register")
	public String register() {
		return "register";
	}

	@RequestMapping("/getUser")
	public String UserInfo() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", userMapper.selectByPrimaryKey(1));
		return "userInfo";
	}

	/*
	 * @RequestMapping("/") public String index(){
	 * System.out.println("nanshou=========="); return "index"; }
	 */

	@RequestMapping(value="/toregister",method = { RequestMethod.POST })
	public String toRegister(@ModelAttribute User user, Model model) {
		System.out.println(user.getUserName());
		String password = md5Encode.md5Pwd(user.getPassword(), user.getUserName());
		user.setPassword(password);
		user.setCreateTime(new Date());
		user.setStatus(1);
		user.setSalt(user.getUserName());
		int num = userMapper.insert(user);
		logger.info("用户注册是否成功" + num);
		if (num >0) {
			Integration integrat = new Integration();
			integrat.setIntegration_number(100);
			List<User> allUser = userService.findAllUser();
			User user2 = new User();
			if(allUser!=null&&allUser.size()>0){
				user2 = allUser.get(allUser.size()-1);
			}
			integrat.setUserId(user2.getId());
			integrationService.insert(integrat);
			return "login";
		} else {
			return "register";
			
		}
	}

	@RequestMapping("/main")
	public String toMain(Model model,HttpServletRequest req) {
		List<User> professorList = professorService.findProfessorList();
		List<Integration> integrationList = new ArrayList<>();
		if (professorList != null && professorList.size() > 0) {
			for (User user : professorList) {
				Integration integration = professorService.findIntegrationByUId(user.getId());
				// 比较积分大小，得到积分前五的显示
				integrationList.add(integration);
			}
			Collections.sort(integrationList);
		}
		List<userDetailVo> list = new ArrayList<>();
		if (integrationList.size() > 5) {
			int index = 0;
			for (Integration integration : integrationList) {
				if (index < 5) {
					User user = professorService.findUserByUserId(integration.getUserId());
					userDetailVo vo = new userDetailVo();
					vo.setUserName(user.getUserName());
					vo.setId(user.getId());
					list.add(vo);
				}

			}
		} else {
			for (Integration integration : integrationList) {
				User user = professorService.findUserByUserId(integration.getUserId());
				userDetailVo vo = new userDetailVo();
				vo.setUserName(user.getUserName());
				vo.setId(user.getId());
				list.add(vo);
			}
		}

		model.addAttribute("professVoList", list);
		// top10 文章
		List<Article> articlelist = infoService.findArticleBySeeCount();
		if (articlelist != null && articlelist.size() > 0) {
			int index = 0;
			List<articleVo> articleVoList = new ArrayList<>();
			for (Article ar : articlelist) {
				if (index < 10) {
					index++;
					articleVo articleVo = new articleVo();
					articleVo.setTitle(ar.getTitle());
					articleVo.setSeecount(ar.getSeecount());
					User user = userService.findUserByPKId(ar.getUid());
					articleVo.setUsername(user.getUserName());
					articleVo.setId(ar.getId());
					articleVoList.add(articleVo);
				}
			}
			model.addAttribute("articleList", articleVoList);
		}
		List<OtherInfo> list2 = otherInfoService.findOtherInfoTop10();
		List<OtherInfo> top10List = new ArrayList<>();
		int index = 0;
		if (list2 != null && list2.size() > 0) {
			if (list2.size() > 10) {
				if (index < 10) {
					for (OtherInfo otherInfo : list2) {
						index++;
						top10List.add(otherInfo);
					}
				}
			}else{
				for (OtherInfo otherInfo : list2) {
					top10List.add(otherInfo);
				}
			}
		}
		model.addAttribute("otherInfoList", top10List);
		model.addAttribute("username", (String)req.getSession().getAttribute("username"));
		return "main";
	}

	@RequestMapping("/logout")
	public String toLogout() {
		Subject subject = SecurityUtils.getSubject();
		if (subject.isAuthenticated()) {
			subject.logout(); // session 会销毁，在SessionListener监听session销毁，清理权限缓存
			/*
			 * if (LOG.isDebugEnabled()) { LOG.debug("用户" + username + "退出登录");
			 * }
			 */// 提示用户退出成功。。。
		}
		return "login";
	}

	@RequestMapping("/seeUserDetail")
	public String seeUserDetail(Model model, HttpServletRequest req) {
		int uId = (int) req.getSession().getAttribute("userId");
		User user1 = userMapper.selectByPrimaryKey(uId);
		userDetailVo userDetailVo = new userDetailVo();
		userDetailVo.setUserName(user1.getUserName());
		userDetailVo.setCreateTime(user1.getCreateTime());
		userDetailVo.setSex(user1.getSex());
		userDetailVo.setTel(user.getTel());
		if (user1.getIsprofessor() != null && user1.getIsprofessor() == 3 && null != user1.getProfessorRemark()
				&& user1.getProfessorRemark().equals("审核通过")) {
			userDetailVo.setIsprofessor(1);
		} else {
			userDetailVo.setIsprofessor(0);
		}
		int integrationCount = professorService.findIntegration(uId);
		List<Question> findMyQuestionList = questionService.findMyQuestion(uId);
		int questionCount = (findMyQuestionList == null || findMyQuestionList.size() == 0) ? 0
				: findMyQuestionList.size();
		List<Article> MyArticleList = infoservice.findMyArticleById(uId);
		int articleCount = (MyArticleList == null || MyArticleList.size() == 0) ? 0 : MyArticleList.size();
		userDetailVo.setIntegration(integrationCount);
		userDetailVo.setQuestionCount(questionCount);
		userDetailVo.setArticleCount(articleCount);
		model.addAttribute("userDetailVo", userDetailVo);
		return "user/seeUserDetail";
	}

	@RequestMapping("/searchseeUserDetail/{id}")
	public String searchSeeUserDetail(@PathVariable("id") Integer uId, Model model, HttpServletRequest req) {
		// int uId = (int) req.getSession().getAttribute("userId");
		User user1 = userMapper.selectByPrimaryKey(uId);
		userDetailVo userDetailVo = new userDetailVo();
		userDetailVo.setUserName(user1.getUserName());
		userDetailVo.setCreateTime(user1.getCreateTime());
		userDetailVo.setSex(user1.getSex());
		userDetailVo.setTel(user.getTel());
		if (user1.getIsprofessor() == 3 && null != user1.getProfessorRemark()
				&& user1.getProfessorRemark().equals("审核通过")) {
			userDetailVo.setIsprofessor(1);
		} else {
			userDetailVo.setIsprofessor(0);
		}
		int integrationCount = professorService.findIntegration(uId);
		List<Question> findMyQuestionList = questionService.findMyQuestion(uId);
		int questionCount = (findMyQuestionList == null || findMyQuestionList.size() == 0) ? 0
				: findMyQuestionList.size();
		List<Article> MyArticleList = infoservice.findMyArticleById(uId);
		int articleCount = (MyArticleList == null || MyArticleList.size() == 0) ? 0 : MyArticleList.size();
		userDetailVo.setIntegration(integrationCount);
		userDetailVo.setQuestionCount(questionCount);
		userDetailVo.setArticleCount(articleCount);
		model.addAttribute("userDetailVo", userDetailVo);
		return "user/seeUserDetail";
	}

	@RequestMapping("/updatePassword")
	public String updatePassword(String userName, String newpassword, String surepasswore, HttpServletRequest req,
			Model model) {
		String str = "";
		User user2 = userMapper.selectByPrimaryKey((int) req.getSession().getAttribute("userId"));

		if (user2 != null) {
			if (user2.getUserName().equals(userName)) {
				String pwd = md5Encode.md5Pwd(newpassword, user2.getUserName());
				// 如果新设置的密码跟原始密码一样 不可修改
				if (user2.getPassword().equals(pwd)) {
					str = "你输入的密码跟原密码一样，不能修改！";
					model.addAttribute("result", str);
				}
				// 如果 新密码跟确认密码一样，可以修改
				if (newpassword.equals(surepasswore)) {
					user2.setPassword(md5Encode.md5Pwd(newpassword, user2.getUserName()));
					int result = userMapper.updateByPrimaryKeySelective(user2);
					if (result > 0) {
						str = "修改成功!";
						model.addAttribute("result", str);
					} else {
						str = "修改失败！";
						model.addAttribute("result", str);
					}
				}
			} else {
				str = "您输入的用户名有误！";
				model.addAttribute("result", str);
			}
		} else {
			str = "你不是本系统用户，请注册！";
			model.addAttribute("result", str);
		}

		return "user/updatePasswordResult";
	}

	@RequestMapping("/updatepwd")
	public String updatepwd() {
		return "user/updatePassword";
	}

	@RequestMapping("/findUserByUserNameLike")
	public List<User> findUserByUserNameLike(String str, Model model) {
		List<User> list = userService.findUserByLikeUsername(str);
		return list;
	}
}
