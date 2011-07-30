package com.amar.dopom.domain.model;

import java.util.Date;

/**
 * This Class represents the To Do Today List 
 * @author amar
 *
 */
public class ToDoToday {
	private String place;
	private Date date;
	private String user;
	
	//getters and setters
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	
	
}
