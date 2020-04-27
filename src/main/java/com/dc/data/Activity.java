package com.dc.data;

import java.util.List;

public class Activity {
	
	String activityCode;
	String activityCreatedAt;
	String activityCreatedBy;
	int activityId;
	String activityName;
	String activityPercentCompletion;
	String activityState;
	String activityStatus;	
	List<Task> actTask;
	String activityUpdatedAt;
	String activityUpdatedBy;

	public Activity() {
		
	}	
	
	public Activity(String activityCode, String activityCreatedAt, String activityCreatedBy, int activityId,
			String activityName, String activityPercentCompletion, String activityState, String activityStatus,
			List<Task> actTask, String activityUpdatedAt, String activityUpdatedBy) {
		super();
		this.activityCode = activityCode;
		this.activityCreatedAt = activityCreatedAt;
		this.activityCreatedBy = activityCreatedBy;
		this.activityId = activityId;
		this.activityName = activityName;
		this.activityPercentCompletion = activityPercentCompletion;
		this.activityState = activityState;
		this.activityStatus = activityStatus;
		this.actTask = actTask;
		this.activityUpdatedAt = activityUpdatedAt;
		this.activityUpdatedBy = activityUpdatedBy;
	}




public String getActivityCode() {
	return activityCode;
}
public void setActivityCode(String activityCode) {
	this.activityCode = activityCode;
}
public String getActivityCreatedAt() {
	return activityCreatedAt;
}
public void setActivityCreatedAt(String activityCreatedAt) {
	this.activityCreatedAt = activityCreatedAt;
}
public String getActivityCreatedBy() {
	return activityCreatedBy;
}
public void setActivityCreatedBy(String activityCreatedBy) {
	this.activityCreatedBy = activityCreatedBy;
}
public int getActivityId() {
	return activityId;
}
public void setActivityId(int activityId) {
	this.activityId = activityId;
}
public String getActivityName() {
	return activityName;
}
public void setActivityName(String activityName) {
	this.activityName = activityName;
}
public String getActivityPercentCompletion() {
	return activityPercentCompletion;
}
public void setActivityPercentCompletion(String activityPercentCompletion) {
	this.activityPercentCompletion = activityPercentCompletion;
}
public String getActivityState() {
	return activityState;
}
public void setActivityState(String activityState) {
	this.activityState = activityState;
}
public String getActivityStatus() {
	return activityStatus;
}
public void setActivityStatus(String activityStatus) {
	this.activityStatus = activityStatus;
}
public List<Task> getActTask() {
	return actTask;
}
public void setActTask(List<Task> actTask) {
	this.actTask = actTask;
}
public String getActivityUpdatedAt() {
	return activityUpdatedAt;
}
public void setActivityUpdatedAt(String activityUpdatedAt) {
	this.activityUpdatedAt = activityUpdatedAt;
}
public String getActivityUpdatedBy() {
	return activityUpdatedBy;
}
public void setActivityUpdatedBy(String activityUpdatedBy) {
	this.activityUpdatedBy = activityUpdatedBy;
}


	}
