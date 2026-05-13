package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.FaqDTO;

@Repository
public class FaqDAOImpl extends BaseDAOImpl<FaqDTO> implements FaqDAOInt {

	@Override
	public Class<FaqDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return FaqDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(FaqDTO dto, CriteriaBuilder criteriaBuilder, Root<FaqDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getFaqCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("faqCode"), dto.getFaqCode() + "%"));
		}
		if (!isEmptyString(dto.getQuestion())) {
			conditions.add(criteriaBuilder.like(qRoot.get("question"), dto.getQuestion() + "%"));
		}
		if (!isEmptyString(dto.getAnswer())) {
			conditions.add(criteriaBuilder.like(qRoot.get("answer"), dto.getAnswer() + "%"));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(FaqDTO dto, UserContext userContext) {
	}
}