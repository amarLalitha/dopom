package com.amar.dopom.domain.model;

import java.util.Date;

import com.amar.dopom.domain.shared.Entity;

public class Activity implements Entity<Activity>{
	private Integer id;
	private String name;
	private Date deadline;
	private Boolean unPlanned;
	private Boolean combined;
	private Integer esimatedPoms;
	private Integer actualPoms;
	private String status;
	
	/**
	 * Default Constructor
	 */
	public Activity() {
		
	}
	
	public Activity(String description, Date deadline) {
		this.name = description;
		this.deadline = deadline;
	}
	
	public Activity(Activity activity) {
		this(activity.name, activity.deadline);
		this.unPlanned = activity.unPlanned;
		this.combined = activity.combined;
		this.esimatedPoms = activity.esimatedPoms;
		this.status = activity.status;
	}
	
	@Override
	public boolean sameIdentityAs(Activity other) {
		Boolean sameIdentity = false;
		if(id.equals(other.id)) {
			sameIdentity = true;
		}
		return sameIdentity;
	}
	
	//getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public Boolean isUnPlanned() {
		return unPlanned;
	}
	public void setUnPlanned(Boolean unPlanned) {
		this.unPlanned = unPlanned;
	}
	
	public Integer getEsimatedPoms() {
		return esimatedPoms;
	}

	public void setEsimatedPoms(Integer esimatedPoms) {
		this.esimatedPoms = esimatedPoms;
	}

	public Boolean isCombined() {
		return combined;
	}
	public void setCombined(Boolean combined) {
		this.combined = combined;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getActualPoms() {
		return actualPoms;
	}

	public void setActualPoms(Integer actualPoms) {
		this.actualPoms = actualPoms;
	}

	
	
}
