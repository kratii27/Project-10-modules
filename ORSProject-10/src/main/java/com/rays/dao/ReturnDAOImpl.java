package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.ReturnDTO;

@Repository
public class ReturnDAOImpl extends BaseDAOImpl<ReturnDTO> implements ReturnDAOInt {

	@Override
	public Class<ReturnDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return ReturnDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(ReturnDTO dto, CriteriaBuilder criteriaBuilder, Root<ReturnDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getReturnCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("returnCode"), dto.getReturnCode() + "%"));
		}
		if (!isZeroNumber(dto.getOrderId())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("orderId"), dto.getOrderId()));
		}
		if (!isEmptyString(dto.getReason())) {
			conditions.add(criteriaBuilder.like(qRoot.get("reason"), dto.getReason() + "%"));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(ReturnDTO dto, UserContext userContext) {
	}
}