package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.FeatureAccessDAOInt;
import com.rays.dto.FeatureAccessDTO;

@Service
@Transactional
public class FeatureAccessServiceImpl extends BaseServiceImpl<FeatureAccessDTO, FeatureAccessDAOInt> implements FeatureAccessServiceInt {
	
}