package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ReturnDTO;
import com.rays.form.ReturnForm;
import com.rays.service.ReturnServiceInt;

@RestController
@RequestMapping(value = "Return")
public class ReturnCtl extends BaseCtl<ReturnDTO, ReturnServiceInt, ReturnForm> {
	
}