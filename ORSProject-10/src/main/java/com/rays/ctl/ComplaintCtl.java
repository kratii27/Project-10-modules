package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ComplaintDTO;
import com.rays.form.ComplaintForm;
import com.rays.service.ComplaintServiceInt;

@RestController
@RequestMapping(value = "Complaint")
public class ComplaintCtl extends BaseCtl<ComplaintDTO, ComplaintServiceInt, ComplaintForm>{

}
