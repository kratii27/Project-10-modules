package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.LockerDAOInt;
import com.rays.dto.LockerDTO;

@Service
@Transactional
public class LockerServiceImpl extends BaseServiceImpl<LockerDTO, LockerDAOInt> implements LockerServiceInt {
	
}