package com.online.consultant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.online.consultant.model.History;
import com.online.consultant.repository.History_Repository;


/**
 * 
 * @author jagadeesh
 * @version 09/05/2022
 *
 */

@Component
public class History_service {

	@Autowired
	History_Repository history;

	/**
	 * getAllData to get all History information from the database
	 * @return list
	 */

	public List<History> getAllData(){
		return history.findAll();
	}

	/**
	 * getDataById is an optional class to get History information by id 
	 * @param id
	 * @return non null values
	 */

	public Optional<History> getDataById(int id) {
		Optional<History> hist=history.findById(id);
		return hist;
	}

	/**
	 * putDataById in this we use id to update datas to the database
	 * @param a
	 * @return String
	 */

	public String putDataById(History a){
		history.save(a);
		return "data putted";

	}

	/**
	 * deleteById is use to delete data by id in the database
	 * @param id
	 * @return String
	 */

	public String deleteById(int id) {
		history.deleteById(id);
		return "data deleted";
	}
}
