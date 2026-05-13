package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.EmiDAOInt;
import com.rays.dto.EmiDTO;

@Service
@Transactional
public class EmiServiceImpl extends BaseServiceImpl<EmiDTO, EmiDAOInt> implements EmiServiceInt {
	
}