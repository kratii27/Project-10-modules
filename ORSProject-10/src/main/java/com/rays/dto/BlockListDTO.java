package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_BLOCK_LIST")
public class BlockListDTO extends BaseDTO {

	@Column(name = "BLOCK_CODE", length = 50)
	private String blockCode;
	
	@Column(name = "USER_NAME", length = 50)
	private String userName;
	
	@Column(name = "REASON", length = 50)
	private String reason;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getBlockCode() {
		return blockCode;
	}
	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
		return blockCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "blockCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return blockCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Block Code";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "BlockList";
	}
}