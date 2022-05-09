package com.online.consultant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.online.consultant.model.Time;
import com.online.consultant.repository.Time_Repository;


/**
 * 
 * @author jagadeesh
 * @version 09/05/2022
 *
 */

@Component
public class Time_service {

	@Autowired
	Time_Repository time;

	/**
	 * getAllData to get all Time information from the database
	 * @return list
	 */

	public List<Time> getAllData() {
		return time.findAll();
	}

	/**
	 * getDataById is an optional class to get Time information by id 
	 * @param id
	 * @return non null values
	 */

	public Optional<Time> getDataById(int id) {
		Optional<Time> tt=time.findById(id);
		return tt;
	}

	/**
	 * putDataById in this we use id to update datas to the database
	 * @param a
	 * @return String
	 */

	public String putData(Time a){
		time.save(a);
		return "data putted";
	}

	/**
	 * deleteById is use to delete data by id in the database
	 * @param id
	 * @return String
	 */

	public String deleteById(int id) {
		time.deleteById(id);
		return "data deleted";
	}
}

