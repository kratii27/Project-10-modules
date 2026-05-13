package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_RATING")
public class RatingDTO extends BaseDTO {

	@Column(name = "RATING_CODE", length = 50)
	private String ratingCode;
	
	@Column(name = "USER_NAME", length = 50)
	private String userName;
	
	@Column(name = "RATING_VALUE")
	private Integer ratingValue;
	
	@Column(name = "STATUS", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return ratingCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "ratingCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return ratingCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Rating Code";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Rating";
	}
}