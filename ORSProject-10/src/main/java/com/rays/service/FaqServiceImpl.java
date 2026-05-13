package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.FaqDAOInt;
import com.rays.dto.FaqDTO;

@Service
@Transactional
public class FaqServiceImpl extends BaseServiceImpl<FaqDTO, FaqDAOInt> implements FaqServiceInt {
	
}