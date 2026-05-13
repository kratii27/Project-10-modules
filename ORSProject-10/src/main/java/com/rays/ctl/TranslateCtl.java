package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.TranslateDTO;
import com.rays.form.TranslateForm;
import com.rays.service.TranslateServiceInt;

@RestController
@RequestMapping(value = "Translate")
public class TranslateCtl extends BaseCtl<TranslateDTO, TranslateServiceInt, TranslateForm> {
	
}