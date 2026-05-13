package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.GymWorkoutDTO;

public class GymWorkoutForm extends BaseForm<GymWorkoutDTO> {

	@NotEmpty(message = "Member Name is Required")
	private String memberName;
	
	@NotEmpty(message = "Workout Type is Required")
	private String workoutType;
	
	@NotEmpty(message = "Trainer Name is Required")
	private String trainerName;
	
	@NotEmpty(message = "Schedule is Required")
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
	public GymWorkoutDTO getDto() {
		GymWorkoutDTO dto = initDTO(new GymWorkoutDTO());
		dto.setMemberName(memberName);
		dto.setWorkoutType(workoutType);
		dto.setTrainerName(trainerName);
		dto.setSchedule(schedule);
		return dto;
	}
}