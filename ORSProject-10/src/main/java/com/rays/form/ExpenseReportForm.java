package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.ExpenseReportDTO;

public class ExpenseReportForm extends BaseForm<ExpenseReportDTO> {

	@NotEmpty(message = "Submitted By is Required")
	private String submittedBy;
	
	@NotNull(message = "Submitted Date is Required")
	private Date submittedDate;
	
	@NotNull(message = "Total Amount is Required")
	@Min(1)
	private Double totalAmount;

	public String getSubmittedBy() {
		return submittedBy;
	}
	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}
	public Date getSubmittedDate() {
		return submittedDate;
	}
	public void setSubmittedDate(Date submittedDate) {
		this.submittedDate = submittedDate;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public ExpenseReportDTO getDto() {
		ExpenseReportDTO dto = initDTO(new ExpenseReportDTO());
		dto.setSubmittedBy(submittedBy);
		dto.setSubmittedDate(submittedDate);
		dto.setTotalAmount(totalAmount);
		return dto;
	}
}