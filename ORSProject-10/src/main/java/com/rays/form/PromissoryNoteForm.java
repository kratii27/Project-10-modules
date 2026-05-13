package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.PromissoryNoteDTO;

public class PromissoryNoteForm extends BaseForm<PromissoryNoteDTO> {

	@NotEmpty(message = "Payee Name is Required")
	private String payeeName;
	
	@NotNull(message = "Face Amount is Required")
	@Min(1)
	private Double faceAmount;
	
	@NotNull(message = "Issue Date is Required")
	private Date issueDate;
	
	@NotEmpty(message = "Status is Required")
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
	public PromissoryNoteDTO getDto() {
		PromissoryNoteDTO dto = initDTO(new PromissoryNoteDTO());
		dto.setPayeeName(payeeName);
		dto.setFaceAmount(faceAmount);
		dto.setIssueDate(issueDate);
		dto.setStatus(status);
		return dto;
	}
}