package com.rays.form;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.RewardDTO;

public class RewardForm extends BaseForm<RewardDTO> {

	@NotEmpty(message = "Reward Code is Required")
	private String rewardCode;
	
	@NotEmpty(message = "User Name is Required")
	private String userName;
	
	@NotNull(message = "Reward Amount is Required")
	@Min(1)
	private BigDecimal rewardAmount;
	
	@NotEmpty(message = "Reward Type is Required")
	private String rewardType;
	
	@NotEmpty(message = "Reward Status is Required")
	private String rewardStatus;

	public String getRewardCode() {
		return rewardCode;
	}
	public void setRewardCode(String rewardCode) {
		this.rewardCode = rewardCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public BigDecimal getRewardAmount() {
		return rewardAmount;
	}
	public void setRewardAmount(BigDecimal rewardAmount) {
		this.rewardAmount = rewardAmount;
	}
	public String getRewardType() {
		return rewardType;
	}
	public void setRewardType(String rewardType) {
		this.rewardType = rewardType;
	}
	public String getRewardStatus() {
		return rewardStatus;
	}
	public void setRewardStatus(String rewardStatus) {
		this.rewardStatus = rewardStatus;
	}

	@Override
	public RewardDTO getDto() {
		RewardDTO dto = initDTO(new RewardDTO());
		dto.setRewardCode(rewardCode);
		dto.setUserName(userName);
		dto.setRewardAmount(rewardAmount);
		dto.setRewardType(rewardType);
		dto.setRewardStatus(rewardStatus);
		return dto;
	}
}