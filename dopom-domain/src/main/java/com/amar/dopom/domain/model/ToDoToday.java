package com.amar.dopom.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This Class represents the To Do Today List 
 * @author amar
 *
 */
public class ToDoToday {
	private String place;
	private Date date;
	private String user;
	private List<Activity> activities = new ArrayList<Activity>();
	
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
	
	public List<Activity> getActivities() {
		return activities;
	}
	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
	
	public void addActivity(Activity activity) {
		activities.add(activity);
	}
}
