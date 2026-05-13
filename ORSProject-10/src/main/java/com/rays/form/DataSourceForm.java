package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.DataSourceDTO;

public class DataSourceForm extends BaseForm<DataSourceDTO> {

	@NotEmpty(message = "Data Source Code is Required")
	private String dataSourceCode;
	
	@NotEmpty(message = "Source Name is Required")
	private String sourceName;
	
	@NotEmpty(message = "Connection Type is Required")
	private String connectionType;
	
	@NotEmpty(message = "Status is Required")
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
	public DataSourceDTO getDto() {
		DataSourceDTO dto = initDTO(new DataSourceDTO());
		dto.setDataSourceCode(dataSourceCode);
		dto.setSourceName(sourceName);
		dto.setConnectionType(connectionType);
		dto.setStatus(status);
		return dto;
	}
}