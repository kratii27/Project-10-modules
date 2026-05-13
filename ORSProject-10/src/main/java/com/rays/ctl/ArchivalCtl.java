package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ArchivalDTO;
import com.rays.form.ArchivalForm;
import com.rays.service.ArchivalServiceInt;

@RestController
@RequestMapping(value = "Archival")
public class ArchivalCtl extends BaseCtl<ArchivalDTO, ArchivalServiceInt, ArchivalForm> {
	
}