package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.RetentionDTO;
import com.rays.dto.UserDTO;

@Repository
public class RetentionDAOImpl extends BaseDAOImpl<RetentionDTO> implements RetentionDAOInt {
	
	@Override
	public Class<RetentionDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return RetentionDTO.class;
	}
	
	@Override
	public List<Predicate> getWhereClause(RetentionDTO dto, CriteriaBuilder criteriaBuilder, Root<RetentionDTO> qRoot) {
		
		List<Predicate> conditions = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getRetentionCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("retentionCode"), dto.getRetentionCode() + "%"));
		}
		if (!isEmptyString(dto.getDataType())) {
			conditions.add(criteriaBuilder.like(qRoot.get("dataType"), dto.getDataType() + "%"));
		}
		if (!isZeroNumber(dto.getDuration())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("duration"), dto.getDuration()));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}
		
		return conditions;
	}
	
	@Override
	protected void populate(RetentionDTO dto, UserContext userContext) {
		// TODO: Add custom populate logic if needed
	}
}