package com.internation.info.vo;

import java.io.Serializable;

import com.internation.info.model.Revert;

public class revertVo extends Revert implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
