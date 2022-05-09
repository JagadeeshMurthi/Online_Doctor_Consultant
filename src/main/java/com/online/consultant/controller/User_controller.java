package com.online.consultant.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.online.consultant.model.Userinfo;
import com.online.consultant.service.Userinfo_service;


/**
 * 
 * @author jagadeesh
 * @version 09/05/2022
 *
 */

@RestController
public class User_controller {

	@Autowired
	Userinfo_service user;

	/**
	 * getAllData is used to get all user details from the server
	 * @return List
	 */

	///URL mapping

	@GetMapping ("/usergetalldata")
	public List<Userinfo> getAllData(){
		return user.getAllData();
	}

	///URL mapping

	@PostMapping("/postdata")
	public Optional<Userinfo> getDataById(@RequestParam ("id") int user_id){
		return user.getDataById(user_id);
	}

	///URL mapping

	@PutMapping ("/putdata")
	public String putdata(@RequestBody Userinfo a){
		return user.putDataById(a);
	}

	///URL mapping

	@DeleteMapping("/deletedata")
	public String deleteById(@RequestParam("id") int user_id) {
		return user.deleteById(user_id);
	}
}
