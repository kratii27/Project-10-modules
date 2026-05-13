package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.CurrencyDTO;
import com.rays.form.CurrencyForm;
import com.rays.service.CurrencyServiceInt;

@RestController
@RequestMapping(value = "Currency")
public class CurrencyCtl extends BaseCtl<CurrencyDTO, CurrencyServiceInt, CurrencyForm> {
	
}