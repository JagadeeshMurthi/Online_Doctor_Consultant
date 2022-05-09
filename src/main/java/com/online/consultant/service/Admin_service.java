package com.online.consultant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.online.consultant.model.Admin;
import com.online.consultant.repository.JPA_repostroy;


/**
 * 
 * @author jagadeesh
 * @version 09/05/2022
 *
 */

@Component
public class Admin_service {

	@Autowired
	JPA_repostroy admins;

	/**
	 * getAllData to get all Admin information from the database
	 * @return list
	 */

	public List<Admin> getAllDataService() {
		return admins.findAll();

	}

	/**
	 * getDataById is an optional class to get Admin information by id 
	 * @param id
	 * @return non null values
	 */

	public Optional<Admin> getDataByIdS(int id) {
		Optional<Admin> admin = admins.findById(id);
		return admin;
	}

	/**
	 * putDataById in this we use id to update datas to the database
	 * @param a
	 * @return String
	 */

	public String putDataById(Admin a){
		admins.save(a);
		return "data putted";
	}

	/**
	 * deleteById is use to delete data by id in the database
	 * @param id
	 * @return String
	 */

	public String deleteById(int id) {
		admins.deleteById(id);
		return "data deleted";
	}

}
