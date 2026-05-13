package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.PromissoryNoteDTO;

@Repository
public class PromissoryNoteDAOImpl extends BaseDAOImpl<PromissoryNoteDTO> implements PromissoryNoteDAOInt {

	@Override
	public Class<PromissoryNoteDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return PromissoryNoteDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(PromissoryNoteDTO dto, CriteriaBuilder criteriaBuilder, Root<PromissoryNoteDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPayeeName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("payeeName"), dto.getPayeeName() + "%"));
		}
		if (!isZeroNumber(dto.getFaceAmount())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("faceAmount"), dto.getFaceAmount()));
		}
		if (isNotNull(dto.getIssueDate())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("issueDate"), dto.getIssueDate()));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(PromissoryNoteDTO dto, UserContext userContext) {
	}
}