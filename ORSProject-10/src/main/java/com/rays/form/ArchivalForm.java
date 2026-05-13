package com.rays.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.ArchivalDTO;

public class ArchivalForm extends BaseForm<ArchivalDTO> {

	@NotEmpty(message = "Policy Code is Required")
	private String policyCode;
	
	@NotEmpty(message = "Data Type is Required")
	private String dataType;
	
	@NotNull(message = "Archive After Days is Required")
	@Min(1)
	private Integer archiveAfterDays;
	
	@NotEmpty(message = "Status is Required")
	private String status;

	public String getPolicyCode() {
		return policyCode;
	}
	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public Integer getArchiveAfterDays() {
		return archiveAfterDays;
	}
	public void setArchiveAfterDays(Integer archiveAfterDays) {
		this.archiveAfterDays = archiveAfterDays;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public ArchivalDTO getDto() {
		ArchivalDTO dto = initDTO(new ArchivalDTO());
		dto.setPolicyCode(policyCode);
		dto.setDataType(dataType);
		dto.setArchiveAfterDays(archiveAfterDays);
		dto.setStatus(status);
		return dto;
	}
}