package com.amar.dopom.domain.model;


import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;

import com.amar.dopom.domain.model.Activity;

public class ActivityTest {

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
	public void constructor() {
		Date rightNow = Calendar.getInstance().getTime();
		Activity activity = new Activity("Test Activity", rightNow);
		Assert.assertEquals("Test Activity", activity.getName());
	}
	
}
