package com.amar.dopom.domain.service;

import java.util.List;

import com.amar.dopom.domain.model.Activity;
import com.amar.dopom.domain.model.ActivityInventory;
import com.amar.dopom.domain.model.ToDoToday;

public interface PomodoroService {
	public void moveActivitiesToToday(ActivityInventory ai, ToDoToday tdt, List<Activity> activities);

}
