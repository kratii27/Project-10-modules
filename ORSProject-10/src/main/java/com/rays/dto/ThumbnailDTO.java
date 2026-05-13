package com.rays.dto;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_THUMBNAIL")
public class ThumbnailDTO extends BaseDTO {
	
	@Column(name = "THUMBNAIL_CODE", length = 50)
	private String thumbnailCode;
	
	@Column(name = "FILE_NAME", length = 50)
	private String fileName;
	
	@Column(name = "RESOLUTION", length = 50)
	private String resolution;
	
	@Column(name = "STATUS", length = 50)
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
	
	public String getName() {
		return fileName;
	}
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return getName();
	}
	
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "thumbnailCode";
	}
	
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return thumbnailCode;
	}
	
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Thumbnail Code";
	}
	
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Thumbnail";
	}
}