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

import com.online.consultant.model.Time;
import com.online.consultant.service.Time_service;


/**
 * 
 * @author jagadeesh
 * @version 09/05/2022
 *
 */

@RestController
public class Time_controller {

	@Autowired
	Time_service time;

	/**
	 * getAllData is used to get all time details from the server
	 * @return List
	 */

	///URL mapping

	@GetMapping("/getalldatabytime")
	public List<Time> getAllData() {
		return time.getAllData();
	}

	///URL mapping

	@PostMapping("/postbytime")
	public Optional<Time> getData(@RequestParam ("id") int time_id) {
		return time.getDataById(time_id);
	}

	///URL mapping

	@PutMapping("/insertbytime")
	public String putdata(@RequestBody Time a) {
		return time.putData(a);
	}

	///URL mapping

	@DeleteMapping("/deletebyappoinment")
	public String deletedatadyid(@RequestParam("id") int time_id) {
		return time.deleteById(time_id);
	}
}
