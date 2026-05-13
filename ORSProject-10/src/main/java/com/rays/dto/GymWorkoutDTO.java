package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_GYM_WORKOUT")
public class GymWorkoutDTO extends BaseDTO {

	@Column(name = "MEMBER_NAME", length = 50)
	private String memberName;
	
	@Column(name = "WORKOUT_TYPE", length = 50)
	private String workoutType;
	
	@Column(name = "TRAINER_NAME", length = 50)
	private String trainerName;
	
	@Column(name = "SCHEDULE", length = 50)
	private String schedule;

	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getWorkoutType() {
		return workoutType;
	}
	public void setWorkoutType(String workoutType) {
		this.workoutType = workoutType;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return memberName;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "memberName";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return memberName;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Member Name";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "GymWorkout";
	}
}