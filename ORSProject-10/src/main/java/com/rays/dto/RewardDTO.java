package com.rays.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_REWARD")
public class RewardDTO extends BaseDTO {

	@Column(name = "REWARD_CODE", length = 50, unique = true)
	private String rewardCode;
	
	@Column(name = "USER_NAME", length = 50)
	private String userName;
	
	@Column(name = "REWARD_AMOUNT")
	private BigDecimal rewardAmount;
	
	@Column(name = "REWARD_TYPE", length = 50)
	private String rewardType;
	
	@Column(name = "REWARD_STATUS", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return rewardCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "rewardCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return rewardCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Reward Code";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Reward";
	}
}