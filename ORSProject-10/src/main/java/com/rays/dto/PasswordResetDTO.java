package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PASSWORD_RESET")
public class PasswordResetDTO extends BaseDTO {

	@Column(name = "RESET_CODE", length = 50, unique = true)
	private String resetCode;
	
	@Column(name = "USER_EMAIL", length = 50)
	private String userEmail;
	
	@Column(name = "EXPIRY_TIME")
	private Date expiryTime;
	
	@Column(name = "RESET_STATUS", length = 50)
	private String resetStatus;

	public String getResetCode() {
		return resetCode;
	}
	public void setResetCode(String resetCode) {
		this.resetCode = resetCode;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getExpiryTime() {
		return expiryTime;
	}
	public void setExpiryTime(Date expiryTime) {
		this.expiryTime = expiryTime;
	}
	public String getResetStatus() {
		return resetStatus;
	}
	public void setResetStatus(String resetStatus) {
		this.resetStatus = resetStatus;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return resetCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "resetCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return resetCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Reset Code";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "PasswordReset";
	}
}