package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.EmailDAOInt;
import com.rays.dto.EmailDTO;

@Service
@Transactional
public class EmailServiceImpl extends BaseServiceImpl<EmailDTO, EmailDAOInt> implements EmailServiceInt {
	
}