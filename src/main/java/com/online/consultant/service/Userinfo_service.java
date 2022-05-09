package com.online.consultant.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.online.consultant.model.Userinfo;
import com.online.consultant.repository.User_Repository;


/**
 * 
 * @author jagadeesh
 * @version 09/05/2022
 *
 */

@Component
public class Userinfo_service {

	@Autowired
	User_Repository user;

	/**
	 * getAllData to get all user information from the database
	 * @return list
	 */

	public List<Userinfo> getAllData(){
		return user.findAll();
	}

	/**
	 * getDataById is an optional class to get user infromation by id 
	 * @param id
	 * @return non null values
	 */
	public Optional<Userinfo> getDataById(int id) {
		Optional<Userinfo> use=user.findById(id);
		return use;
	}

	/**
	 * putDataById in this we use id to update datas to the database
	 * @param a
	 * @return String
	 */

	public String putDataById(Userinfo a){
		user.save(a);
		return "Data Putted";

	}

	/**
	 * deleteById is use to delete data by id in the database
	 * @param user_id
	 * @return String
	 */

	public String deleteById(int user_id) {
		user.deleteById(user_id);
		return "Data Deleted";
	}
}

