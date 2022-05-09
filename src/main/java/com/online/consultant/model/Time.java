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
public class Time {

	@Id
	private int time_id;
	private String appointment_scheduling;
	private String Available_time;

	/*
	 * In this we use Getter and Setter Injuction
	 * @return int
	 * @return String
	 */

	public int getTime_id() {
		return time_id;
	}
	public void setTime_id(int time_id) {
		this.time_id = time_id;
	}
	public String getAppointment_scheduling() {
		return appointment_scheduling;
	}
	public void setAppointment_scheduling(String appointment_scheduling) {
		this.appointment_scheduling = appointment_scheduling;
	}
	public String getAvailable_time() {
		return Available_time;
	}
	public void setAvailable_time(String available_time) {
		Available_time = available_time;
	}
}