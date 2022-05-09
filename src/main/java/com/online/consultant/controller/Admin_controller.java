package com.online.consultant.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.online.consultant.model.Admin;
import com.online.consultant.model.Mail;
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
	
	@Autowired
	RestTemplate resttemplate;
	
	@PostMapping(value="/sendmail")
	@HystrixCommand(fallbackMethod = "getFallBack")
	public ResponseEntity<String> callmailservicetogetdata(@RequestBody Mail mail) {
		ResponseEntity<String> res=resttemplate.postForEntity("http://localhost:8097/sendmail", mail, String.class);
		return res ;
	}


	public ResponseEntity<String> getFallBack(Mail mail) {
		return new ResponseEntity<String>("Mail Service is down....Please try after sometime", HttpStatus.OK);
	}
	
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}

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


