package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ComplaintDTO;

@Repository
public class ComplaintDAOImpl extends BaseDAOImpl<ComplaintDTO> implements ComplaintDAOInt {

	@Override
	public Class<ComplaintDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return ComplaintDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(ComplaintDTO dto, CriteriaBuilder criteriaBuilder, Root<ComplaintDTO> qRoot) {
		List<Predicate> conditions = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getComplaintType())) {
			conditions.add(criteriaBuilder.like(qRoot.get("complaintType"), dto.getComplaintType() + "%"));
		}
		if (!isEmptyString(dto.getCustomerName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("customerName"), dto.getCustomerName() + "%"));
		}
		if (!isEmptyString(dto.getComplaintStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("complaintStatus"), dto.getComplaintStatus() + "%"));
		}
		
		return conditions;
	}

}
