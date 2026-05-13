package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PROMISSORY_NOTE")
public class PromissoryNoteDTO extends BaseDTO {

	@Column(name = "PAYEE_NAME", length = 50)
	private String payeeName;
	
	@Column(name = "FACE_AMOUNT")
	private Double faceAmount;
	
	@Column(name = "ISSUE_DATE")
	private Date issueDate;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public Double getFaceAmount() {
		return faceAmount;
	}
	public void setFaceAmount(Double faceAmount) {
		this.faceAmount = faceAmount;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
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
		return payeeName;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "payeeName";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return payeeName;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Payee Name";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "PromissoryNote";
	}
}