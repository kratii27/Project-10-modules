package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.ArchivalDTO;

@Repository
public class ArchivalDAOImpl extends BaseDAOImpl<ArchivalDTO> implements ArchivalDAOInt {

	@Override
	public Class<ArchivalDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return ArchivalDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(ArchivalDTO dto, CriteriaBuilder criteriaBuilder, Root<ArchivalDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPolicyCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("policyCode"), dto.getPolicyCode() + "%"));
		}
		if (!isEmptyString(dto.getDataType())) {
			conditions.add(criteriaBuilder.like(qRoot.get("dataType"), dto.getDataType() + "%"));
		}
		if (!isZeroNumber(dto.getArchiveAfterDays())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("archiveAfterDays"), dto.getArchiveAfterDays()));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(ArchivalDTO dto, UserContext userContext) {
	}
}