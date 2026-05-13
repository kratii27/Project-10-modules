package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.EmailDTO;

public class EmailForm extends BaseForm<EmailDTO> {

	@NotEmpty(message = "Email Code is Required")
	private String emailCode;
	
	@NotEmpty(message = "To Address is Required")
	private String toAddress;
	
	@NotEmpty(message = "Subject is Required")
	private String subject;
	
	@NotEmpty(message = "Status is Required")
	private String status;

	public String getEmailCode() {
		return emailCode;
	}
	public void setEmailCode(String emailCode) {
		this.emailCode = emailCode;
	}
	public String getToAddress() {
		return toAddress;
	}
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public EmailDTO getDto() {
		EmailDTO dto = initDTO(new EmailDTO());
		dto.setEmailCode(emailCode);
		dto.setToAddress(toAddress);
		dto.setSubject(subject);
		dto.setStatus(status);
		return dto;
	}
}