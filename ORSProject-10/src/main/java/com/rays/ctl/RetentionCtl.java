package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.common.UserContext;
import com.rays.dto.RetentionDTO;
import com.rays.form.RetentionForm;
import com.rays.service.RetentionServiceInt;

@RestController
@RequestMapping(value = "Retention")
public class RetentionCtl extends BaseCtl<RetentionDTO, RetentionServiceInt, RetentionForm> {
	
}