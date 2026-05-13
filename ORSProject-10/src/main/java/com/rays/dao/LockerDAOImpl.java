package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.LockerDTO;

@Repository
public class LockerDAOImpl extends BaseDAOImpl<LockerDTO> implements LockerDAOInt {

	@Override
	public Class<LockerDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return LockerDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(LockerDTO dto, CriteriaBuilder criteriaBuilder, Root<LockerDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getLockerNumber())) {
			conditions.add(criteriaBuilder.like(qRoot.get("lockerNumber"), dto.getLockerNumber() + "%"));
		}
		if (!isEmptyString(dto.getLockerType())) {
			conditions.add(criteriaBuilder.like(qRoot.get("lockerType"), dto.getLockerType() + "%"));
		}
		if (!isZeroNumber(dto.getAnnualFee())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("annualFee"), dto.getAnnualFee()));
		}

		return conditions;
	}

	@Override
	protected void populate(LockerDTO dto, UserContext userContext) {
	}
}