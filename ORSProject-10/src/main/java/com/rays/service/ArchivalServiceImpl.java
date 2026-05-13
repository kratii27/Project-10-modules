package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ArchivalDAOInt;
import com.rays.dto.ArchivalDTO;

@Service
@Transactional
public class ArchivalServiceImpl extends BaseServiceImpl<ArchivalDTO, ArchivalDAOInt> implements ArchivalServiceInt {
	
}