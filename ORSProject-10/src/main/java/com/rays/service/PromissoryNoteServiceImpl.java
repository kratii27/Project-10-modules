package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PromissoryNoteDAOInt;
import com.rays.dto.PromissoryNoteDTO;

@Service
@Transactional
public class PromissoryNoteServiceImpl extends BaseServiceImpl<PromissoryNoteDTO, PromissoryNoteDAOInt> implements PromissoryNoteServiceInt {
	
}