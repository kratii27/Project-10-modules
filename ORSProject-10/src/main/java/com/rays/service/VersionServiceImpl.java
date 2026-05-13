package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.VersionDAOInt;
import com.rays.dto.VersionDTO;

@Service
@Transactional
public class VersionServiceImpl extends BaseServiceImpl<VersionDTO, VersionDAOInt> implements VersionServiceInt {
	
}