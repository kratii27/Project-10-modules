package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ReturnDAOInt;
import com.rays.dto.ReturnDTO;

@Service
@Transactional
public class ReturnServiceImpl extends BaseServiceImpl<ReturnDTO, ReturnDAOInt> implements ReturnServiceInt {
	
}