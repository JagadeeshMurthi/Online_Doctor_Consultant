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

import com.online.consultant.model.History;
import com.online.consultant.service.History_service;


/**
 * 
 * @author jagadeesh
 * @version 09/05/2022
 *
 */

@RestController
public class History_controller {

	@Autowired
	History_service history;

	/**
	 * getAllData is used to get all history data from the server
	 * @return List
	 */

	///URL mapping

	@GetMapping("/getalldatainhistory")
	public List<History> getAllData() {
		return history.getAllData();
	}

	///URL mapping

	@PostMapping("/postbyhistory")
	public Optional<History> getDataById(@RequestParam ("id") int history_id ) {
		return history.getDataById(history_id);
	}

	///URL mapping

	@PutMapping("/putbyhistory")
	public String putdata(@RequestBody History a) {
		return history.putDataById(a);
	}

	///URL mapping

	@DeleteMapping("/deletebyhistory")
	public String deletedata(@RequestParam ("id") int history_id) {
		return history.deleteById(history_id);
	}
}
