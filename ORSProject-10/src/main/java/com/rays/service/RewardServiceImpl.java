package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.RewardDAOInt;
import com.rays.dto.RewardDTO;

@Service
@Transactional
public class RewardServiceImpl extends BaseServiceImpl<RewardDTO, RewardDAOInt> implements RewardServiceInt {
	
}