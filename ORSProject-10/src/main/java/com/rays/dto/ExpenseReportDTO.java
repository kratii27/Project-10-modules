package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_EXPENSE_REPORT")
public class ExpenseReportDTO extends BaseDTO {

	@Column(name = "SUBMITTED_BY", length = 50)
	private String submittedBy;
	
	@Column(name = "SUBMITTED_DATE")
	private Date submittedDate;
	
	@Column(name = "TOTAL_AMOUNT")
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
	public String getValue() {
		// TODO Auto-generated method stub
		return submittedBy;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "submittedBy";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return submittedBy;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Submitted By";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "ExpenseReport";
	}
}