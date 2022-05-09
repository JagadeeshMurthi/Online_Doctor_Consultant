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

import com.online.consultant.model.Doctor_feed;
import com.online.consultant.service.Doctor_service;


/**
 * 
 * @author jagadeesh
 * @version 09/05/2022
 *
 */

@RestController
public class Doctor_controller {

	@Autowired
	Doctor_service doctor;

	/**
	 * getAllData is used to get all doctors details from the server
	 * @return list
	 */

	///URL mapping

	@GetMapping ("/doctorgetalldata")
	public List<Doctor_feed> getAllData(){
		return doctor.getAllData();
	}

	///URL mapping

	@PostMapping("/postbyid")
	public Optional<Doctor_feed> postDataById(@RequestParam ("id") int  Doctor_id) {
		return doctor.postDataById(Doctor_id);
	}

	///URL mapping

	@PutMapping ("/putbyid")
	public String putdata(@RequestBody Doctor_feed a){
		return doctor.putDataById(a);
	}

	///URL mapping

	@DeleteMapping("/deletebyid")
	public String deleteById(@RequestParam("id") int doctor_id) {
		return doctor.deleteById(doctor_id);
	}
}
