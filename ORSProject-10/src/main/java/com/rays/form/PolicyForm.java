package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.PolicyDTO;

public class PolicyForm extends BaseForm<PolicyDTO> {

	@NotEmpty(message = "Policy Name is Required")
	private String policyName;
	
	@NotNull(message = "Premium Amount is Required")
	@Min(1)
	private Double premiumAmount;
	
	@NotNull(message = "Start Date is Required")
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
	public PolicyDTO getDto() {
		PolicyDTO dto = initDTO(new PolicyDTO());
		dto.setPolicyName(policyName);
		dto.setPremiumAmount(premiumAmount);
		dto.setStartDate(startDate);
		return dto;
	}
}