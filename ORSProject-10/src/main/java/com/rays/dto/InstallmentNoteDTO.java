package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_INSTALLMENT_NOTE")
public class InstallmentNoteDTO extends BaseDTO {

	@Column(name = "TOTAL_AMOUNT")
	private Integer totalAmount;
	
	@Column(name = "TOTAL_INSTALLMENTS")
	private Integer totalInstallments;
	
	@Column(name = "INSTALLMENT_AMOUNT")
	private Integer installmentAmount;
	
	@Column(name = "NEXT_DUE_DATE")
	private Date nextDueDate;

	public Integer getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Integer getTotalInstallments() {
		return totalInstallments;
	}
	public void setTotalInstallments(Integer totalInstallments) {
		this.totalInstallments = totalInstallments;
	}
	public Integer getInstallmentAmount() {
		return installmentAmount;
	}
	public void setInstallmentAmount(Integer installmentAmount) {
		this.installmentAmount = installmentAmount;
	}
	public Date getNextDueDate() {
		return nextDueDate;
	}
	public void setNextDueDate(Date nextDueDate) {
		this.nextDueDate = nextDueDate;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return String.valueOf(totalAmount);
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "totalAmount";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return String.valueOf(totalAmount);
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Total Amount";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "InstallmentNote";
	}
}