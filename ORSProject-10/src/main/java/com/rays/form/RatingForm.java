package com.rays.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.RatingDTO;

public class RatingForm extends BaseForm<RatingDTO> {

	@NotEmpty(message = "Rating Code is Required")
	private String ratingCode;
	
	@NotEmpty(message = "User Name is Required")
	private String userName;
	
	@NotNull(message = "Rating Value is Required")
	@Min(1)
	private Integer ratingValue;
	
	@NotEmpty(message = "Status is Required")
	private String status;

	public String getRatingCode() {
		return ratingCode;
	}
	public void setRatingCode(String ratingCode) {
		this.ratingCode = ratingCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getRatingValue() {
		return ratingValue;
	}
	public void setRatingValue(Integer ratingValue) {
		this.ratingValue = ratingValue;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public RatingDTO getDto() {
		RatingDTO dto = initDTO(new RatingDTO());
		dto.setRatingCode(ratingCode);
		dto.setUserName(userName);
		dto.setRatingValue(ratingValue);
		dto.setStatus(status);
		return dto;
	}
}