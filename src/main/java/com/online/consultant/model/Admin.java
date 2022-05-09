package com.online.consultant.model;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * 
 * @author jagadeesh
 * @version 09/05/2022
 *
 */

@Entity

public class Admin {

	@Id
	private int admin_id;
	private String admin_name;
	private String mail_id;
	private String admin_password;
	
	/*
	 * In this we use Getter and Setter Injuction
	 * @return int
	 * @return String
	 */
	
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	
}