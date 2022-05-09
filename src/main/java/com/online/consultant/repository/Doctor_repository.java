package com.online.consultant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.consultant.model.Doctor_feed;


/**
 * 
 * @author jagadeesh
 * @version 09/05/2022
 *
 */

@Repository
public interface Doctor_repository extends JpaRepository<Doctor_feed,Integer> {

}




