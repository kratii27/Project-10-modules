package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_EMI")
public class EmiDTO extends BaseDTO {

	@Column(name = "AMOUNT")
	private Double amount;
	
	@Column(name = "DUE_DATE")
	private Date dueDate;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
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
		return status;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "status";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return status;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Status";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Emi";
	}
}