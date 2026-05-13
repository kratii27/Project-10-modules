package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.PolicyDTO;

@Repository
public class PolicyDAOImpl extends BaseDAOImpl<PolicyDTO> implements PolicyDAOInt {

	@Override
	public Class<PolicyDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return PolicyDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(PolicyDTO dto, CriteriaBuilder criteriaBuilder, Root<PolicyDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPolicyName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("policyName"), dto.getPolicyName() + "%"));
		}
		if (!isZeroNumber(dto.getPremiumAmount())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("premiumAmount"), dto.getPremiumAmount()));
		}
		if (isNotNull(dto.getStartDate())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("startDate"), dto.getStartDate()));
		}

		return conditions;
	}

	@Override
	protected void populate(PolicyDTO dto, UserContext userContext) {
	}
}