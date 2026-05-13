package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.CurrencyDAOInt;
import com.rays.dto.CurrencyDTO;

@Service
@Transactional
public class CurrencyServiceImpl extends BaseServiceImpl<CurrencyDTO, CurrencyDAOInt> implements CurrencyServiceInt {
	
}