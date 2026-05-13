package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.EmiDTO;

public class EmiForm extends BaseForm<EmiDTO> {

	@NotNull(message = "Amount is Required")
	@Min(1)
	private Double amount;
	
	@NotNull(message = "Due Date is Required")
	private Date dueDate;
	
	@NotEmpty(message = "Status is Required")
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
	public EmiDTO getDto() {
		EmiDTO dto = initDTO(new EmiDTO());
		dto.setAmount(amount);
		dto.setDueDate(dueDate);
		dto.setStatus(status);
		return dto;
	}
}