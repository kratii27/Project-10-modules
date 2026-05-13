package com.rays.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_COMPLAINT")
public class ComplaintDTO extends BaseDTO {
	
	private String complaintCode;

	private String customerName;

	private String complaintType;

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
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "complaintCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return complaintCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Complaint Code";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Complaint";
	}

}
