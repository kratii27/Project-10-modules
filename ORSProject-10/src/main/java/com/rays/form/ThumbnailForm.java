package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseForm;
import com.rays.dto.ThumbnailDTO;

public class ThumbnailForm extends BaseForm<ThumbnailDTO> {
	
	@NotEmpty(message = "Thumbnail Code is Required")
	private String thumbnailCode;
	
	@NotEmpty(message = "File Name is Required")
	private String fileName;
	
	@NotEmpty(message = "Resolution is Required")
	private String resolution;
	
	@NotEmpty(message = "Status is Required")
	private String status;
	
	public String getThumbnailCode() {
		return thumbnailCode;
	}
	
	public void setThumbnailCode(String thumbnailCode) {
		this.thumbnailCode = thumbnailCode;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public String getResolution() {
		return resolution;
	}
	
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public ThumbnailDTO getDto() {
		ThumbnailDTO dto = initDTO(new ThumbnailDTO());
		dto.setThumbnailCode(thumbnailCode);
		dto.setFileName(fileName);
		dto.setResolution(resolution);
		dto.setStatus(status);
		return dto;
	}
}