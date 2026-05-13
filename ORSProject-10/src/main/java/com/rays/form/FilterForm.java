package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.FilterDTO;

public class FilterForm extends BaseForm<FilterDTO> {

	@NotEmpty(message = "Filter Code is Required")
	private String filterCode;
	
	@NotEmpty(message = "Filter Name is Required")
	private String filterName;
	
	@NotEmpty(message = "Value is Required")
	private String value;
	
	@NotEmpty(message = "Status is Required")
	private String status;

	public String getFilterCode() {
		return filterCode;
	}
	public void setFilterCode(String filterCode) {
		this.filterCode = filterCode;
	}
	public String getFilterName() {
		return filterName;
	}
	public void setFilterName(String filterName) {
		this.filterName = filterName;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public FilterDTO getDto() {
		FilterDTO dto = initDTO(new FilterDTO());
		dto.setFilterCode(filterCode);
		dto.setFilterName(filterName);
		dto.setFilterValue(value);
		dto.setStatus(status);
		return dto;
	}
}