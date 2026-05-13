package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.ComplaintDTO;

public class ComplaintForm extends BaseForm<ComplaintDTO> {
	
	@NotEmpty(message = "Complaint Code is required")
	private String complaintCode;

	@NotEmpty(message = "Customer name is required")
	private String customerName;

	@NotEmpty(message = "Complaint Type is required")
	private String complaintType;

	@NotEmpty(message = "Complaint Status is required")
	private String complaintStatus;

	public String getComplaintCode() {
		return complaintCode;
	}

	public void setComplaintCode(String complaintCode) {
		this.complaintCode = complaintCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getComplaintType() {
		return complaintType;
	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	public String getComplaintStatus() {
		return complaintStatus;
	}

	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
	}
	
	@Override
	public ComplaintDTO getDto() {
		ComplaintDTO dto = initDTO(new ComplaintDTO());
		dto.setComplaintCode(complaintCode);
		dto.setCustomerName(customerName);
		dto.setComplaintType(complaintType);
		dto.setComplaintStatus(complaintStatus);
		return dto;
	}

}
