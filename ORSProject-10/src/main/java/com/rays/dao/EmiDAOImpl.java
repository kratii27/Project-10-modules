package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.EmiDTO;

@Repository
public class EmiDAOImpl extends BaseDAOImpl<EmiDTO> implements EmiDAOInt {

	@Override
	public Class<EmiDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return EmiDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(EmiDTO dto, CriteriaBuilder criteriaBuilder, Root<EmiDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isZeroNumber(dto.getAmount())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("amount"), dto.getAmount()));
		}
		if (isNotNull(dto.getDueDate())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("dueDate"), dto.getDueDate()));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(EmiDTO dto, UserContext userContext) {
	}
}