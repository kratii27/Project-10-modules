package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.ExpenseReportDTO;

@Repository
public class ExpenseReportDAOImpl extends BaseDAOImpl<ExpenseReportDTO> implements ExpenseReportDAOInt {

	@Override
	public Class<ExpenseReportDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return ExpenseReportDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(ExpenseReportDTO dto, CriteriaBuilder criteriaBuilder, Root<ExpenseReportDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getSubmittedBy())) {
			conditions.add(criteriaBuilder.like(qRoot.get("submittedBy"), dto.getSubmittedBy() + "%"));
		}
		if (isNotNull(dto.getSubmittedDate())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("submittedDate"), dto.getSubmittedDate()));
		}
		if (!isZeroNumber(dto.getTotalAmount())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("totalAmount"), dto.getTotalAmount()));
		}

		return conditions;
	}

	@Override
	protected void populate(ExpenseReportDTO dto, UserContext userContext) {
	}
}