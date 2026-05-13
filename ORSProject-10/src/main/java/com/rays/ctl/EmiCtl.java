package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.EmiDTO;
import com.rays.form.EmiForm;
import com.rays.service.EmiServiceInt;

@RestController
@RequestMapping(value = "Emi")
public class EmiCtl extends BaseCtl<EmiDTO, EmiServiceInt, EmiForm> {
	
}