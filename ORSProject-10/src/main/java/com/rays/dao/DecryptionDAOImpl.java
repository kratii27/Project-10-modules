package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.DecryptionDTO;

@Repository
public class DecryptionDAOImpl extends BaseDAOImpl<DecryptionDTO> implements DecryptionDAOInt {

	@Override
	public Class<DecryptionDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return DecryptionDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(DecryptionDTO dto, CriteriaBuilder criteriaBuilder, Root<DecryptionDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getDecryptionCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("decryptionCode"), dto.getDecryptionCode() + "%"));
		}
		if (!isEmptyString(dto.getAlgorithm())) {
			conditions.add(criteriaBuilder.like(qRoot.get("algorithm"), dto.getAlgorithm() + "%"));
		}
		if (!isEmptyString(dto.getKeyUsed())) {
			conditions.add(criteriaBuilder.like(qRoot.get("keyUsed"), dto.getKeyUsed() + "%"));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(DecryptionDTO dto, UserContext userContext) {
	}
}