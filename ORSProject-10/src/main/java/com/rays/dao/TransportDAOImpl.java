package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.TransportDTO;

@Repository
public class TransportDAOImpl extends BaseDAOImpl<TransportDTO> implements TransportDAOInt {

	@Override
	public Class<TransportDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return TransportDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(TransportDTO dto, CriteriaBuilder criteriaBuilder, Root<TransportDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getVehicleType())) {
			conditions.add(criteriaBuilder.like(qRoot.get("vehicleType"), dto.getVehicleType() + "%"));
		}
		if (!isEmptyString(dto.getDriverName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("driverName"), dto.getDriverName() + "%"));
		}
		if (!isZeroNumber(dto.getCharges())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("charges"), dto.getCharges()));
		}

		return conditions;
	}

	@Override
	protected void populate(TransportDTO dto, UserContext userContext) {
	}
}