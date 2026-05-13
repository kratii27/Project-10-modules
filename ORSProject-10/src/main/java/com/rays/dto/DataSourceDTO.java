package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_DATA_SOURCE")
public class DataSourceDTO extends BaseDTO {

	@Column(name = "DATA_SOURCE_CODE", length = 50)
	private String dataSourceCode;
	
	@Column(name = "SOURCE_NAME", length = 50)
	private String sourceName;
	
	@Column(name = "CONNECTION_TYPE", length = 50)
	private String connectionType;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getDataSourceCode() {
		return dataSourceCode;
	}
	public void setDataSourceCode(String dataSourceCode) {
		this.dataSourceCode = dataSourceCode;
	}
	public String getSourceName() {
		return sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	public String getConnectionType() {
		return connectionType;
	}
	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
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
		return dataSourceCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "dataSourceCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return dataSourceCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Data Source Code";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "DataSource";
	}
}