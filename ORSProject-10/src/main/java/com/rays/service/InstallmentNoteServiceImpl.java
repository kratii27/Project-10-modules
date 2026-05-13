package com.rays.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.InstallmentNoteDAOInt;
import com.rays.dto.InstallmentNoteDTO;

@Service
@Transactional
public class InstallmentNoteServiceImpl extends BaseServiceImpl<InstallmentNoteDTO, InstallmentNoteDAOInt> implements InstallmentNoteServiceInt {
	
}