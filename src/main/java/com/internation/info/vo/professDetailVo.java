package com.internation.info.vo;

public class professDetailVo {
	private String userName;
	/**
	 * 积分
	 */
	private Integer integration;
	private Integer articleCount;
	private String professorType;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getIntegration() {
		return integration;
	}
	public void setIntegration(Integer integration) {
		this.integration = integration;
	}
	public Integer getArticleCount() {
		return articleCount;
	}
	public void setArticleCount(Integer articleCount) {
		this.articleCount = articleCount;
	}
	public String getProfessorType() {
		return professorType;
	}
	public void setProfessorType(String professorType) {
		this.professorType = professorType;
	}
	
}
