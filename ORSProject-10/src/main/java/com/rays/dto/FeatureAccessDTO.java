package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_FEATURE_ACCESS")
public class FeatureAccessDTO extends BaseDTO {

	@Column(name = "ACCESS_CODE", length = 50)
	private String accessCode;
	
	@Column(name = "FEATURE_NAME", length = 50)
	private String featureName;
	
	@Column(name = "USER_NAME", length = 50)
	private String userName;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getAccessCode() {
		return accessCode;
	}
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}
	public String getFeatureName() {
		return featureName;
	}
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
		return accessCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "accessCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return accessCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Access Code";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "FeatureAccess";
	}
}