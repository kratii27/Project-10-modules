package com.rays.dto;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_RETENTION")
public class RetentionDTO extends BaseDTO {
	
	@Column(name = "RETENTION_CODE", length = 50)
	private String retentionCode;
	
	@Column(name = "DATA_TYPE", length = 50)
	private String dataType;
	
	@Column(name = "DURATION")
	private Integer duration;
	
	@Column(name = "STATUS", length = 50)
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
	
	public String getName() {
		return retentionCode;
	}
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return getName();
	}
	
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "retentionCode";
	}
	
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return retentionCode;
	}
	
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Retention Code";
	}
	
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Retention";
	}
}