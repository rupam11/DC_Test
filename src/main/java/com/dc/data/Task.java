package com.dc.data;

public class Task {

	String act_task_percentCompletion;
	String act_task_taskApplicable;
	String act_task_taskCode;
	String act_task_taskComments;
	String act_task_taskCreatedAt;
	String act_task_taskUpdatedAt;
	String act_task_taskUpdatedBy;
	String act_task_taskCreatedBy;
	String act_task_taskDescription;
	int act_task_taskId;
	String act_task_taskProcessName;
	String act_task_taskSquadName;
	String act_task_taskSquadType;
	String act_task_taskState;
	String act_task_taskStatus;
	
	public Task() {}


	public Task(String act_task_percentCompletion, String act_task_taskApplicable, String act_task_taskCode,
			String act_task_taskComments, String act_task_taskCreatedAt, String act_task_taskUpdatedAt,
			String act_task_taskUpdatedBy, String act_task_taskCreatedBy, String act_task_taskDescription,
			int act_task_taskId, String act_task_taskProcessName, String act_task_taskSquadName,
			String act_task_taskSquadType, String act_task_taskState, String act_task_taskStatus) {
//		super();
		this.act_task_percentCompletion = act_task_percentCompletion;
		this.act_task_taskApplicable = act_task_taskApplicable;
		this.act_task_taskCode = act_task_taskCode;
		this.act_task_taskComments = act_task_taskComments;
		this.act_task_taskCreatedAt = act_task_taskCreatedAt;
		this.act_task_taskUpdatedAt = act_task_taskUpdatedAt;
		this.act_task_taskUpdatedBy = act_task_taskUpdatedBy;
		this.act_task_taskCreatedBy = act_task_taskCreatedBy;
		this.act_task_taskDescription = act_task_taskDescription;
		this.act_task_taskId = act_task_taskId;
		this.act_task_taskProcessName = act_task_taskProcessName;
		this.act_task_taskSquadName = act_task_taskSquadName;
		this.act_task_taskSquadType = act_task_taskSquadType;
		this.act_task_taskState = act_task_taskState;
		this.act_task_taskStatus = act_task_taskStatus;
	}
	
	
	public String getAct_task_percentCompletion() {
		return act_task_percentCompletion;
	}

	public void setAct_task_percentCompletion(String act_task_percentCompletion) {
		this.act_task_percentCompletion = act_task_percentCompletion;
	}

	public String getAct_task_taskApplicable() {
		return act_task_taskApplicable;
	}

	public void setAct_task_taskApplicable(String act_task_taskApplicable) {
		this.act_task_taskApplicable = act_task_taskApplicable;
	}

	public String getAct_task_taskCode() {
		return act_task_taskCode;
	}

	public void setAct_task_taskCode(String act_task_taskCode) {
		this.act_task_taskCode = act_task_taskCode;
	}

	public String getAct_task_taskComments() {
		return act_task_taskComments;
	}

	public void setAct_task_taskComments(String act_task_taskComments) {
		this.act_task_taskComments = act_task_taskComments;
	}

	public String getAct_task_taskCreatedAt() {
		return act_task_taskCreatedAt;
	}

	public void setAct_task_taskCreatedAt(String act_task_taskCreatedAt) {
		this.act_task_taskCreatedAt = act_task_taskCreatedAt;
	}

	public String getAct_task_taskUpdatedAt() {
		return act_task_taskUpdatedAt;
	}

	public void setAct_task_taskUpdatedAt(String act_task_taskUpdatedAt) {
		this.act_task_taskUpdatedAt = act_task_taskUpdatedAt;
	}

	public String getAct_task_taskUpdatedBy() {
		return act_task_taskUpdatedBy;
	}

	public void setAct_task_taskUpdatedBy(String act_task_taskUpdatedBy) {
		this.act_task_taskUpdatedBy = act_task_taskUpdatedBy;
	}

	public String getAct_task_taskCreatedBy() {
		return act_task_taskCreatedBy;
	}

	public void setAct_task_taskCreatedBy(String act_task_taskCreatedBy) {
		this.act_task_taskCreatedBy = act_task_taskCreatedBy;
	}

	public String getAct_task_taskDescription() {
		return act_task_taskDescription;
	}

	public void setAct_task_taskDescription(String act_task_taskDescription) {
		this.act_task_taskDescription = act_task_taskDescription;
	}

	public int getAct_task_taskId() {
		return act_task_taskId;
	}

	public void setAct_task_taskId(int act_task_taskId) {
		this.act_task_taskId = act_task_taskId;
	}

	public String getAct_task_taskProcessName() {
		return act_task_taskProcessName;
	}

	public void setAct_task_taskProcessName(String act_task_taskProcessName) {
		this.act_task_taskProcessName = act_task_taskProcessName;
	}

	public String getAct_task_taskSquadName() {
		return act_task_taskSquadName;
	}

	public void setAct_task_taskSquadName(String act_task_taskSquadName) {
		this.act_task_taskSquadName = act_task_taskSquadName;
	}

	public String getAct_task_taskSquadType() {
		return act_task_taskSquadType;
	}

	public void setAct_task_taskSquadType(String act_task_taskSquadType) {
		this.act_task_taskSquadType = act_task_taskSquadType;
	}

	public String getAct_task_taskState() {
		return act_task_taskState;
	}

	public void setAct_task_taskState(String act_task_taskState) {
		this.act_task_taskState = act_task_taskState;
	}

	public String getAct_task_taskStatus() {
		return act_task_taskStatus;
	}

	public void setAct_task_taskStatus(String act_task_taskStatus) {
		this.act_task_taskStatus = act_task_taskStatus;
	}


	@Override
	public String toString() {
		return "Task [act_task_percentCompletion=" + act_task_percentCompletion + ", act_task_taskApplicable="
				+ act_task_taskApplicable + ", act_task_taskCode=" + act_task_taskCode + ", act_task_taskComments="
				+ act_task_taskComments + ", act_task_taskCreatedAt=" + act_task_taskCreatedAt
				+ ", act_task_taskUpdatedAt=" + act_task_taskUpdatedAt + ", act_task_taskUpdatedBy="
				+ act_task_taskUpdatedBy + ", act_task_taskCreatedBy=" + act_task_taskCreatedBy
				+ ", act_task_taskDescription=" + act_task_taskDescription + ", act_task_taskId=" + act_task_taskId
				+ ", act_task_taskProcessName=" + act_task_taskProcessName + ", act_task_taskSquadName="
				+ act_task_taskSquadName + ", act_task_taskSquadType=" + act_task_taskSquadType
				+ ", act_task_taskState=" + act_task_taskState + ", act_task_taskStatus=" + act_task_taskStatus + "]";
	}
	

}
