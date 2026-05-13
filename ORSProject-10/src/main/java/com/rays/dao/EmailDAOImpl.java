package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.EmailDTO;

@Repository
public class EmailDAOImpl extends BaseDAOImpl<EmailDTO> implements EmailDAOInt {

	@Override
	public Class<EmailDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return EmailDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(EmailDTO dto, CriteriaBuilder criteriaBuilder, Root<EmailDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getEmailCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("emailCode"), dto.getEmailCode() + "%"));
		}
		if (!isEmptyString(dto.getToAddress())) {
			conditions.add(criteriaBuilder.like(qRoot.get("toAddress"), dto.getToAddress() + "%"));
		}
		if (!isEmptyString(dto.getSubject())) {
			conditions.add(criteriaBuilder.like(qRoot.get("subject"), dto.getSubject() + "%"));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(EmailDTO dto, UserContext userContext) {
	}
}