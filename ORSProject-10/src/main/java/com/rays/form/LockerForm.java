package com.rays.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.LockerDTO;

public class LockerForm extends BaseForm<LockerDTO> {

	@NotEmpty(message = "Locker Number is Required")
	private String lockerNumber;
	
	@NotEmpty(message = "Locker Type is Required")
	private String lockerType;
	
	@NotNull(message = "Annual Fee is Required")
	@Min(1)
	private Double annualFee;

	public String getLockerNumber() {
		return lockerNumber;
	}
	public void setLockerNumber(String lockerNumber) {
		this.lockerNumber = lockerNumber;
	}
	public String getLockerType() {
		return lockerType;
	}
	public void setLockerType(String lockerType) {
		this.lockerType = lockerType;
	}
	public Double getAnnualFee() {
		return annualFee;
	}
	public void setAnnualFee(Double annualFee) {
		this.annualFee = annualFee;
	}

	@Override
	public LockerDTO getDto() {
		LockerDTO dto = initDTO(new LockerDTO());
		dto.setLockerNumber(lockerNumber);
		dto.setLockerType(lockerType);
		dto.setAnnualFee(annualFee);
		return dto;
	}
}