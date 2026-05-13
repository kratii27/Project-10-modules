package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_LOCKER")
public class LockerDTO extends BaseDTO {

	@Column(name = "LOCKER_NUMBER", length = 50)
	private String lockerNumber;
	
	@Column(name = "LOCKER_TYPE", length = 50)
	private String lockerType;
	
	@Column(name = "ANNUAL_FEE")
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
	public String getValue() {
		// TODO Auto-generated method stub
		return lockerNumber;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "lockerNumber";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return lockerNumber;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Locker Number";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Locker";
	}
}