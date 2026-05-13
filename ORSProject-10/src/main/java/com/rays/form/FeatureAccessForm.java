package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.FeatureAccessDTO;

public class FeatureAccessForm extends BaseForm<FeatureAccessDTO> {

	@NotEmpty(message = "Access Code is Required")
	private String accessCode;
	
	@NotEmpty(message = "Feature Name is Required")
	private String featureName;
	
	@NotEmpty(message = "User Name is Required")
	private String userName;
	
	@NotEmpty(message = "Status is Required")
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
	public FeatureAccessDTO getDto() {
		FeatureAccessDTO dto = initDTO(new FeatureAccessDTO());
		dto.setAccessCode(accessCode);
		dto.setFeatureName(featureName);
		dto.setUserName(userName);
		dto.setStatus(status);
		return dto;
	}
}