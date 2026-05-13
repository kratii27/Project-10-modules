package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.FeatureAccessDTO;

@Repository
public class FeatureAccessDAOImpl extends BaseDAOImpl<FeatureAccessDTO> implements FeatureAccessDAOInt {

	@Override
	public Class<FeatureAccessDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return FeatureAccessDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(FeatureAccessDTO dto, CriteriaBuilder criteriaBuilder, Root<FeatureAccessDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getAccessCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("accessCode"), dto.getAccessCode() + "%"));
		}
		if (!isEmptyString(dto.getFeatureName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("featureName"), dto.getFeatureName() + "%"));
		}
		if (!isEmptyString(dto.getUserName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(FeatureAccessDTO dto, UserContext userContext) {
	}
}