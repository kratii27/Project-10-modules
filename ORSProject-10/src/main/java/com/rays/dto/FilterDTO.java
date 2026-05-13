package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_FILTER")
public class FilterDTO extends BaseDTO {

	@Column(name = "FILTER_CODE", length = 50)
	private String filterCode;
	
	@Column(name = "FILTER_NAME", length = 50)
	private String filterName;
	
	@Column(name = "FILTER_VALUE", length = 50)
	private String value;
	
	@Column(name = "STATUS", length = 50)
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
	public String getFilterValue() {
		return value;
	}
	public void setFilterValue(String value) {
		this.value = value;
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
		return filterCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "filterCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return filterCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Filter Code";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Filter";
	}
}