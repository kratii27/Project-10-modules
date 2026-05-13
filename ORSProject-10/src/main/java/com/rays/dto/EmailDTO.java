package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_EMAIL")
public class EmailDTO extends BaseDTO {

	@Column(name = "EMAIL_CODE", length = 50)
	private String emailCode;
	
	@Column(name = "TO_ADDRESS", length = 50)
	private String toAddress;
	
	@Column(name = "SUBJECT", length = 50)
	private String subject;
	
	@Column(name = "STATUS", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return emailCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "emailCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return emailCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Email Code";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Email";
	}
}