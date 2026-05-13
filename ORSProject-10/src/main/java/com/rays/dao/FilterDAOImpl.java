package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.FilterDTO;

@Repository
public class FilterDAOImpl extends BaseDAOImpl<FilterDTO> implements FilterDAOInt {

	@Override
	public Class<FilterDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return FilterDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(FilterDTO dto, CriteriaBuilder criteriaBuilder, Root<FilterDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getFilterCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("filterCode"), dto.getFilterCode() + "%"));
		}
		if (!isEmptyString(dto.getFilterName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("filterName"), dto.getFilterName() + "%"));
		}
		if (!isEmptyString(dto.getFilterValue())) {
			conditions.add(criteriaBuilder.like(qRoot.get("value"), dto.getFilterValue() + "%"));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(FilterDTO dto, UserContext userContext) {
	}
}