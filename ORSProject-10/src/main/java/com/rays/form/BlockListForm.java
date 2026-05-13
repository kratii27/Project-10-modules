package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.BlockListDTO;

public class BlockListForm extends BaseForm<BlockListDTO> {

	@NotEmpty(message = "Block Code is Required")
	private String blockCode;
	
	@NotEmpty(message = "User Name is Required")
	private String userName;
	
	@NotEmpty(message = "Reason is Required")
	private String reason;
	
	@NotEmpty(message = "Status is Required")
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
	public BlockListDTO getDto() {
		BlockListDTO dto = initDTO(new BlockListDTO());
		dto.setBlockCode(blockCode);
		dto.setUserName(userName);
		dto.setReason(reason);
		dto.setStatus(status);
		return dto;
	}
}