package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DataSourceDAOInt;
import com.rays.dto.DataSourceDTO;

@Service
@Transactional
public class DataSourceServiceImpl extends BaseServiceImpl<DataSourceDTO, DataSourceDAOInt> implements DataSourceServiceInt {
	
}