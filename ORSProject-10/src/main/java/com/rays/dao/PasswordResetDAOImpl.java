package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.PasswordResetDTO;

@Repository
public class PasswordResetDAOImpl extends BaseDAOImpl<PasswordResetDTO> implements PasswordResetDAOInt {

	@Override
	public Class<PasswordResetDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return PasswordResetDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(PasswordResetDTO dto, CriteriaBuilder criteriaBuilder, Root<PasswordResetDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getResetCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("resetCode"), dto.getResetCode() + "%"));
		}
		if (!isEmptyString(dto.getUserEmail())) {
			conditions.add(criteriaBuilder.like(qRoot.get("userEmail"), dto.getUserEmail() + "%"));
		}
		if (isNotNull(dto.getExpiryTime())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("expiryTime"), dto.getExpiryTime()));
		}
		if (!isEmptyString(dto.getResetStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("resetStatus"), dto.getResetStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(PasswordResetDTO dto, UserContext userContext) {
	}
}