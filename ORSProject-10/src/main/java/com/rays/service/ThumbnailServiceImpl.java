package com.rays.service;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.ThumbnailDAOInt;
import com.rays.dto.ThumbnailDTO;

@Service
@Transactional
public class ThumbnailServiceImpl extends BaseServiceImpl<ThumbnailDTO, ThumbnailDAOInt> implements ThumbnailServiceInt {
	
}