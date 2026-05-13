package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.TranslateDAOInt;
import com.rays.dto.TranslateDTO;

@Service
@Transactional
public class TranslateServiceImpl extends BaseServiceImpl<TranslateDTO, TranslateDAOInt> implements TranslateServiceInt {
	
}