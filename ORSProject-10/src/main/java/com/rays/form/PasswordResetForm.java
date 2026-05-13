package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.PasswordResetDTO;

public class PasswordResetForm extends BaseForm<PasswordResetDTO> {

	@NotEmpty(message = "Reset Code is Required")
	private String resetCode;
	
	@NotEmpty(message = "User Email is Required")
	private String userEmail;
	
	@NotNull(message = "Expiry Time is Required")
	private Date expiryTime;
	
	@NotEmpty(message = "Reset Status is Required")
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
	public PasswordResetDTO getDto() {
		PasswordResetDTO dto = initDTO(new PasswordResetDTO());
		dto.setResetCode(resetCode);
		dto.setUserEmail(userEmail);
		dto.setExpiryTime(expiryTime);
		dto.setResetStatus(resetStatus);
		return dto;
	}
}