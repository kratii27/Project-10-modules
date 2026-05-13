package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.PasswordResetDTO;
import com.rays.form.PasswordResetForm;
import com.rays.service.PasswordResetServiceInt;

@RestController
@RequestMapping(value = "PasswordReset")
public class PasswordResetCtl extends BaseCtl<PasswordResetDTO, PasswordResetServiceInt, PasswordResetForm> {
	
}