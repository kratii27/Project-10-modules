package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_CLAIM")
public class ClaimDTO extends BaseDTO {

	@Column(name = "CLAIM_NUMBER", length = 50)
	private String claimNumber;
	
	@Column(name = "CLAIM_AMOUNT")
	private Double claimAmount;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getClaimNumber() {
		return claimNumber;
	}
	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}
	public Double getClaimAmount() {
		return claimAmount;
	}
	public void setClaimAmount(Double claimAmount) {
		this.claimAmount = claimAmount;
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
		return claimNumber;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "claimNumber";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return claimNumber;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Claim Number";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Claim";
	}
}