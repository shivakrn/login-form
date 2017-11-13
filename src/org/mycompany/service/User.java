package org.mycompany.service;

import java.io.Serializable;

public class User implements Serializable{

	private String username;
	private String password;
	private String loginStatus;
	private String selectedFruit="Banana";
	
	public String getUserName() {
		System.out.println("username--- "+username);
		return username;
	}
	public void setUsername(String userName) {
		System.out.println("Fired--- ");
		this.username = "xyz";
	}
	public String getPassword() {
		return password;
	}
	/*public void setpassword(String password) {
		this.password = password;
	}*/
	public String getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	public String getSelectedFruit() {
		return selectedFruit;
	}
	public void setSelectedFruit(String selectedFruit) {
		this.selectedFruit = selectedFruit;
	}
	
}
