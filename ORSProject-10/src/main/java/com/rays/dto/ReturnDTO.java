package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_RETURN")
public class ReturnDTO extends BaseDTO {

	@Column(name = "RETURN_CODE", length = 50)
	private String returnCode;
	
	@Column(name = "ORDER_ID")
	private Long orderId;
	
	@Column(name = "REASON", length = 50)
	private String reason;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
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
		return returnCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "returnCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return returnCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Return Code";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Return";
	}
}