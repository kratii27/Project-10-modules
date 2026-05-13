package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.RatingDTO;

@Repository
public class RatingDAOImpl extends BaseDAOImpl<RatingDTO> implements RatingDAOInt {

	@Override
	public Class<RatingDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return RatingDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(RatingDTO dto, CriteriaBuilder criteriaBuilder, Root<RatingDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getRatingCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("ratingCode"), dto.getRatingCode() + "%"));
		}
		if (!isEmptyString(dto.getUserName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}
		if (!isZeroNumber(dto.getRatingValue())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("ratingValue"), dto.getRatingValue()));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(RatingDTO dto, UserContext userContext) {
	}
}