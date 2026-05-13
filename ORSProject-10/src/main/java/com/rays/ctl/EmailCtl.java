package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.EmailDTO;
import com.rays.form.EmailForm;
import com.rays.service.EmailServiceInt;

@RestController
@RequestMapping(value = "Email")
public class EmailCtl extends BaseCtl<EmailDTO, EmailServiceInt, EmailForm> {
	
}