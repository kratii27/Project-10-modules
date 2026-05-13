package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ExpenseReportDTO;
import com.rays.form.ExpenseReportForm;
import com.rays.service.ExpenseReportServiceInt;

@RestController
@RequestMapping(value = "ExpenseReport")
public class ExpenseReportCtl extends BaseCtl<ExpenseReportDTO, ExpenseReportServiceInt, ExpenseReportForm> {
	
}