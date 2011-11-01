package com.amar.dopom.domain.model;

public class TodoTask extends Activity {
	private Integer realPoms;
	private Boolean unplannedAndUrgent;
	
	public void addPomodoro() {
		setRealPoms(++realPoms);
	}
	
	public Integer getRealPoms() {
		return realPoms;
	}

	public void setRealPoms(Integer realPoms) {
		this.realPoms = realPoms;
	}

	public Boolean getUnplannedAndUrgent() {
		return unplannedAndUrgent;
	}

	public void setUnplannedAndUrgent(Boolean unplannedAndUrgent) {
		this.unplannedAndUrgent = unplannedAndUrgent;
	}

}
