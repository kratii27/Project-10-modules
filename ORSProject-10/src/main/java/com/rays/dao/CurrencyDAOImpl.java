package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.CurrencyDTO;

@Repository
public class CurrencyDAOImpl extends BaseDAOImpl<CurrencyDTO> implements CurrencyDAOInt {

	@Override
	public Class<CurrencyDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return CurrencyDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(CurrencyDTO dto, CriteriaBuilder criteriaBuilder, Root<CurrencyDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getCurrencyCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("currencyCode"), dto.getCurrencyCode() + "%"));
		}
		if (!isEmptyString(dto.getCurrencyName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("currencyName"), dto.getCurrencyName() + "%"));
		}
		if (!isEmptyString(dto.getSymbol())) {
			conditions.add(criteriaBuilder.like(qRoot.get("symbol"), dto.getSymbol() + "%"));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(CurrencyDTO dto, UserContext userContext) {
	}
}