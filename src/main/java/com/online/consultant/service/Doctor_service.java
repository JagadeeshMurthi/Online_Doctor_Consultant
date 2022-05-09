package com.online.consultant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.online.consultant.model.Doctor_feed;
import com.online.consultant.repository.Doctor_repository;


/**
 * 
 * @author jagadeesh
 * @version09/05/2022
 *
 */

@Component
public class Doctor_service {

	@Autowired
	Doctor_repository Doctor;


	/**
	 * getAllData to get all Doctor information from the database
	 * @return list
	 */

	public List<Doctor_feed> getAllData(){
		return Doctor.findAll();

	}

	/**
	 * getDataById is an optional class to get Doctor information by id 
	 * @param id
	 * @return non null values
	 */

	public Optional<Doctor_feed> postDataById(int id) {
		Optional<Doctor_feed> doc = Doctor.findById(id);
		return doc;
	}

	/**
	 * putDataById in this we use id to update datas to the database
	 * @param a
	 * @return String
	 */

	public String putDataById(Doctor_feed a){
		Doctor.save(a);
		return "Data Putted";

	}

	/**
	 * deleteById is use to delete data by id in the database
	 * @param doctor_id
	 * @return String
	 */

	public String deleteById(int doctor_id) {
		Doctor.deleteById(doctor_id);
		return "Data Deleted";
	}
}
