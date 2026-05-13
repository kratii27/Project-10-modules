package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseForm;
import com.rays.dto.RetentionDTO;

public class RetentionForm extends BaseForm<RetentionDTO> {
	
	@NotEmpty(message = "Retention Code is Required")
	private String retentionCode;
	
	@NotEmpty(message = "Data Type is Required")
	private String dataType;
	
	@NotNull(message = "Duration is Required")
	@Min(1)
	private Integer duration;
	
	@NotEmpty(message = "Status is Required")
	private String status;
	
	public String getRetentionCode() {
		return retentionCode;
	}
	
	public void setRetentionCode(String retentionCode) {
		this.retentionCode = retentionCode;
	}
	
	public String getDataType() {
		return dataType;
	}
	
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	
	public Integer getDuration() {
		return duration;
	}
	
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public RetentionDTO getDto() {
		RetentionDTO dto = initDTO(new RetentionDTO());
		dto.setRetentionCode(retentionCode);
		dto.setDataType(dataType);
		dto.setDuration(duration);
		dto.setStatus(status);
		return dto;
	}
}