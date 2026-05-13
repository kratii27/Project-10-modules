package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.FeatureAccessDTO;
import com.rays.form.FeatureAccessForm;
import com.rays.service.FeatureAccessServiceInt;

@RestController
@RequestMapping(value = "FeatureAccess")
public class FeatureAccessCtl extends BaseCtl<FeatureAccessDTO, FeatureAccessServiceInt, FeatureAccessForm> {
	
}