package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_VERSION")
public class VersionDTO extends BaseDTO {

	@Column(name = "VERSION_CODE", length = 50)
	private String versionCode;
	
	@Column(name = "VERSION_NAME", length = 50)
	private String versionName;
	
	@Column(name = "RELEASE_DATE")
	private Date releaseDate;
	
	@Column(name = "VERSION_STATUS", length = 50)
	private String versionStatus;

	public String getVersionCode() {
		return versionCode;
	}
	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}
	public String getVersionName() {
		return versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getVersionStatus() {
		return versionStatus;
	}
	public void setVersionStatus(String versionStatus) {
		this.versionStatus = versionStatus;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return versionName;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "versionCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return versionCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Version Code";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Version";
	}
}