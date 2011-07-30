package com.amar.dopom.domain.model;

import java.util.ArrayList;
import java.util.List;

import com.amar.dopom.domain.shared.Entity;

public class ActivityInventory implements Entity<ActivityInventory>{
	private String user;
	private List<Activity> activities = new ArrayList<Activity>();
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
	
	public void combineActivities(List<Activity> activities) {
		//remove the activities from the activities list
		//create a new Activity that represents combination of the activities
	}
	@Override
	public boolean sameIdentityAs(ActivityInventory other) {
		Boolean sameIdentity = false;
		if(user.equals(other.user)) {
			sameIdentity = true;
		}
		return sameIdentity;
	}
}
