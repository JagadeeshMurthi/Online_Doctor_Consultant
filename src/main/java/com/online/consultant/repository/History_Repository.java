package com.online.consultant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.online.consultant.model.History;


/**
 * 
 * @author jagadeesh
 * @version 09/05/2022
 *
 */

@Repository
public interface History_Repository extends JpaRepository<History, Integer>{

}
