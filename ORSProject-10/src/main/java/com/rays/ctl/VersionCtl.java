package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.VersionDTO;
import com.rays.form.VersionForm;
import com.rays.service.VersionServiceInt;

@RestController
@RequestMapping(value = "Version")
public class VersionCtl extends BaseCtl<VersionDTO, VersionServiceInt, VersionForm> {
	
}