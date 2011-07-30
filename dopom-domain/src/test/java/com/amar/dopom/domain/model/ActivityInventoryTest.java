package com.amar.dopom.domain.model;

import java.util.Calendar;
import java.util.Date;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amar.dopom.domain.model.Activity;
import com.amar.dopom.domain.model.ActivityInventory;


public class ActivityInventoryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void addActivity() {
		Date rightNow = Calendar.getInstance().getTime();
		Activity activity = new Activity("Test Activity", rightNow);
		
		ActivityInventory actInventory = new ActivityInventory();
		actInventory.addActivity(activity);
		
		Activity testActivity = actInventory.getActivities().get(0);
		
		Assert.assertEquals(activity, testActivity);
	}

}
