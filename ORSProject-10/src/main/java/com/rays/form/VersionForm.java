package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseForm;
import com.rays.dto.VersionDTO;

public class VersionForm extends BaseForm<VersionDTO> {

	@NotEmpty(message = "Version Code is Required")
	private String versionCode;
	
	@NotEmpty(message = "Version Name is Required")
	private String versionName;
	
	@NotNull(message = "Release Date is Required")
	private Date releaseDate;
	
	@NotEmpty(message = "Version Status is Required")
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
	public VersionDTO getDto() {
		VersionDTO dto = initDTO(new VersionDTO());
		dto.setVersionCode(versionCode);
		dto.setVersionName(versionName);
		dto.setReleaseDate(releaseDate);
		dto.setVersionStatus(versionStatus);
		return dto;
	}
}