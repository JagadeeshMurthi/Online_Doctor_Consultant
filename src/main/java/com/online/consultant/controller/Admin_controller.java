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

import com.online.consultant.model.Admin;
import com.online.consultant.service.Admin_service;


/**
 * 
 * @author jagadeesh
 * @version 09/05/2022
 *
 */

@RestController
public class Admin_controller {

	@Autowired
	Admin_service admin;

	/**
	 * getAllData is used to  get admin details from the server
	 * @return list
	 */

	///URL mapping

	@GetMapping("/getalldata")
	public List<Admin> getAllData() {
		return admin.getAllDataService();
	}

	///URL mapping

	@PostMapping("/posted")
	public Optional<Admin> getDataById(@RequestParam ("id") int admin_id) {
		return admin.getDataByIdS(admin_id);
	}

	//URL mapping

	@PutMapping("/put")
	public String putdata(@RequestBody Admin a) {
		return admin.putDataById(a);
	}

	///URL mapping

	@DeleteMapping("/delete")
	public String deletedata(@RequestParam ("id") int admin_id) {
		return admin.deleteById(admin_id);
	}

}


