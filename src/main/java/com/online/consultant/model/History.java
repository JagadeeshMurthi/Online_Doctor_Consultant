package com.online.consultant.model;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * 
 * @author jagadeesh
 * @version 09/05/2022
 *
 */

@Entity

public class History {
	
	@Id
	private int history_id;
	private String patient_name;
	private String doctor_name;
	private String patient_problem;
	private String doctor_specialist;
	private String medical_history;
	private String patient_address;
	private String Gender;
	
	/*
	 * In this we use Getter and Setter Injuction
	 * @return int
	 * @return String
	 */
	
	public int getHistory_id() {
		return history_id;
	}
	public void setHistory_id(int history_id) {
		this.history_id = history_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getPatient_problem() {
		return patient_problem;
	}
	public void setPatient_problem(String patient_problem) {
		this.patient_problem = patient_problem;
	}
	public String getDoctor_specialist() {
		return doctor_specialist;
	}
	public void setDoctor_specialist(String doctor_specialist) {
		this.doctor_specialist = doctor_specialist;
	}
	public String getMedical_history() {
		return medical_history;
	}
	public void setMedical_history(String medical_history) {
		this.medical_history = medical_history;
	}
	public String getPatient_address() {
		return patient_address;
	}
	public void setPatient_address(String patient_address) {
		this.patient_address = patient_address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
}