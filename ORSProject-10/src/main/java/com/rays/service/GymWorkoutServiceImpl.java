package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.GymWorkoutDAOInt;
import com.rays.dto.GymWorkoutDTO;

@Service
@Transactional
public class GymWorkoutServiceImpl extends BaseServiceImpl<GymWorkoutDTO, GymWorkoutDAOInt> implements GymWorkoutServiceInt {
	
}