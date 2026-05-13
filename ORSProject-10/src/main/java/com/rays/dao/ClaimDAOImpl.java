package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.ClaimDTO;

@Repository
public class ClaimDAOImpl extends BaseDAOImpl<ClaimDTO> implements ClaimDAOInt {

	@Override
	public Class<ClaimDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return ClaimDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(ClaimDTO dto, CriteriaBuilder criteriaBuilder, Root<ClaimDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getClaimNumber())) {
			conditions.add(criteriaBuilder.like(qRoot.get("claimNumber"), dto.getClaimNumber() + "%"));
		}
		if (!isZeroNumber(dto.getClaimAmount())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("claimAmount"), dto.getClaimAmount()));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(ClaimDTO dto, UserContext userContext) {
	}
}