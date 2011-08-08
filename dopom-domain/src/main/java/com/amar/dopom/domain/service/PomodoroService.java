package com.amar.dopom.domain.service;

import java.util.Date;
import java.util.List;

import com.amar.dopom.domain.model.Activity;
import com.amar.dopom.domain.model.ActivityInventory;
import com.amar.dopom.domain.model.ToDoToday;

public interface PomodoroService {
	/**
	 * This method moves the given activities to today for the given user
	 * @param user
	 * @param activities
	 */
	public void moveActivitiesToToday(String user, List<Activity> activities);
	/**
	 * If activities are part of todoToday, check if all the 
	 * dates on todoToday are same otherwise combine fails. Also
	 * combine fails if there are already pomodoros existing for 
	 * any of the activities.
	 * @param activities
	 */
	public void combineActivities(List<Activity> activities);
	/**
	 * This method adds a new activity for the given user
	 * @param name
	 * @param user
	 */
	public void addNewActivity(String user, String name, Date deadline);

}
