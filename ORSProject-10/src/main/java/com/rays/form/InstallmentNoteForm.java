package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.InstallmentNoteDTO;

public class InstallmentNoteForm extends BaseForm<InstallmentNoteDTO> {

	@NotNull(message = "Total Amount is Required")
	@Min(1)
	private Integer totalAmount;
	
	@NotNull(message = "Total Installments is Required")
	@Min(1)
	private Integer totalInstallments;
	
	@NotNull(message = "Installment Amount is Required")
	@Min(1)
	private Integer installmentAmount;
	
	@NotNull(message = "Next Due Date is Required")
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
	public InstallmentNoteDTO getDto() {
		InstallmentNoteDTO dto = initDTO(new InstallmentNoteDTO());
		dto.setTotalAmount(totalAmount);
		dto.setTotalInstallments(totalInstallments);
		dto.setInstallmentAmount(installmentAmount);
		dto.setNextDueDate(nextDueDate);
		return dto;
	}
}