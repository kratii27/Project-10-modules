package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ARCHIVAL")
public class ArchivalDTO extends BaseDTO {

	@Column(name = "POLICY_CODE", length = 50)
	private String policyCode;
	
	@Column(name = "DATA_TYPE", length = 50)
	private String dataType;
	
	@Column(name = "ARCHIVE_AFTER_DAYS")
	private Integer archiveAfterDays;
	
	@Column(name = "STATUS", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return policyCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "policyCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return policyCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Policy Code";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Archival";
	}
}