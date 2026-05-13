package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.DataSourceDTO;
import com.rays.form.DataSourceForm;
import com.rays.service.DataSourceServiceInt;

@RestController
@RequestMapping(value = "DataSource")
public class DataSourceCtl extends BaseCtl<DataSourceDTO, DataSourceServiceInt, DataSourceForm> {
	
}
