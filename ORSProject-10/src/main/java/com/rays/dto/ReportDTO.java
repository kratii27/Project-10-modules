package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_REPORT")
public class ReportDTO extends BaseDTO {

	@Column(name = "REPORT_TYPE", length = 50)
	private String reportType;
	
	@Column(name = "GENERATED_DATE")
	private Date generatedDate;
	
	@Column(name = "REMARKS", length = 50)
	private String remarks;

	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	public Date getGeneratedDate() {
		return generatedDate;
	}
	public void setGeneratedDate(Date generatedDate) {
		this.generatedDate = generatedDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return reportType;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "reportType";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return reportType;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Report Type";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Report";
	}
}