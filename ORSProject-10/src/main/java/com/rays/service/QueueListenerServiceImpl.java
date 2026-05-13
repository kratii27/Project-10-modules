package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.QueueListenerDAOInt;
import com.rays.dto.QueueListenerDTO;

@Service
@Transactional
public class QueueListenerServiceImpl extends BaseServiceImpl<QueueListenerDTO, QueueListenerDAOInt> implements QueueListenerServiceInt {
	
}