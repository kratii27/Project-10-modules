package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.ReportDTO;

@Repository
public class ReportDAOImpl extends BaseDAOImpl<ReportDTO> implements ReportDAOInt {

	@Override
	public Class<ReportDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return ReportDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(ReportDTO dto, CriteriaBuilder criteriaBuilder, Root<ReportDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getReportType())) {
			conditions.add(criteriaBuilder.like(qRoot.get("reportType"), dto.getReportType() + "%"));
		}
		if (isNotNull(dto.getGeneratedDate())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("generatedDate"), dto.getGeneratedDate()));
		}
		if (!isEmptyString(dto.getRemarks())) {
			conditions.add(criteriaBuilder.like(qRoot.get("remarks"), dto.getRemarks() + "%"));
		}

		return conditions;
	}

	@Override
	protected void populate(ReportDTO dto, UserContext userContext) {
	}
}