package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.FaqDTO;
import com.rays.form.FaqForm;
import com.rays.service.FaqServiceInt;

@RestController
@RequestMapping(value = "Faq")
public class FaqCtl extends BaseCtl<FaqDTO, FaqServiceInt, FaqForm> {
	
}