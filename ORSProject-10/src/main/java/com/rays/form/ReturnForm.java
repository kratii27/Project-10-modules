package com.rays.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.ReturnDTO;

public class ReturnForm extends BaseForm<ReturnDTO> {

	@NotEmpty(message = "Return Code is Required")
	private String returnCode;
	
	@NotNull(message = "Order Id is Required")
	@Min(1)
	private Long orderId;
	
	@NotEmpty(message = "Reason is Required")
	private String reason;
	
	@NotEmpty(message = "Status is Required")
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
	public ReturnDTO getDto() {
		ReturnDTO dto = initDTO(new ReturnDTO());
		dto.setReturnCode(returnCode);
		dto.setOrderId(orderId);
		dto.setReason(reason);
		dto.setStatus(status);
		return dto;
	}
}