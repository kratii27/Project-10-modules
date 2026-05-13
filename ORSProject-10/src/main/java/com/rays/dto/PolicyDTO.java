package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_POLICY")
public class PolicyDTO extends BaseDTO {

	@Column(name = "POLICY_NAME", length = 50)
	private String policyName;
	
	@Column(name = "PREMIUM_AMOUNT")
	private Double premiumAmount;
	
	@Column(name = "START_DATE")
	private Date startDate;

	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public Double getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(Double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return policyName;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "policyName";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return policyName;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Policy Name";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Policy";
	}
}