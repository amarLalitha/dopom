package com.amar.dopom.domain.model;

import java.util.ArrayList;
import java.util.List;

import com.amar.dopom.domain.shared.Entity;

public class ActivityInventory implements Entity<ActivityInventory>{
	private User user;
	private List<Activity> activities = new ArrayList<Activity>();
	
	public ActivityInventory() {}
	public ActivityInventory(User user, List<Activity> activities) {
		this.user = user;
		this.activities = activities;
	}
		
	public User getUser() {
		return user;
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
	
	@Override
	public boolean sameIdentityAs(ActivityInventory other) {
		Boolean sameIdentity = false;
		if(user.equals(other.user)) {
			sameIdentity = true;
		}
		return sameIdentity;
	}
}
