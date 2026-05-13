package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.InstallmentNoteDTO;

@Repository
public class InstallmentNoteDAOImpl extends BaseDAOImpl<InstallmentNoteDTO> implements InstallmentNoteDAOInt {

	@Override
	public Class<InstallmentNoteDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return InstallmentNoteDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(InstallmentNoteDTO dto, CriteriaBuilder criteriaBuilder, Root<InstallmentNoteDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isZeroNumber(dto.getTotalAmount())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("totalAmount"), dto.getTotalAmount()));
		}
		if (!isZeroNumber(dto.getTotalInstallments())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("totalInstallments"), dto.getTotalInstallments()));
		}
		if (!isZeroNumber(dto.getInstallmentAmount())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("installmentAmount"), dto.getInstallmentAmount()));
		}
		if (isNotNull(dto.getNextDueDate())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("nextDueDate"), dto.getNextDueDate()));
		}

		return conditions;
	}

	@Override
	protected void populate(InstallmentNoteDTO dto, UserContext userContext) {
	}
}