package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.DataSourceDTO;

@Repository
public class DataSourceDAOImpl extends BaseDAOImpl<DataSourceDTO> implements DataSourceDAOInt {

	@Override
	public Class<DataSourceDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return DataSourceDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(DataSourceDTO dto, CriteriaBuilder criteriaBuilder, Root<DataSourceDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getDataSourceCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("dataSourceCode"), dto.getDataSourceCode() + "%"));
		}
		if (!isEmptyString(dto.getSourceName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("sourceName"), dto.getSourceName() + "%"));
		}
		if (!isEmptyString(dto.getConnectionType())) {
			conditions.add(criteriaBuilder.like(qRoot.get("connectionType"), dto.getConnectionType() + "%"));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(DataSourceDTO dto, UserContext userContext) {
	}
}