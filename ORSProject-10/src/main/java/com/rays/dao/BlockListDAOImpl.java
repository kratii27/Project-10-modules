package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.BlockListDTO;

@Repository
public class BlockListDAOImpl extends BaseDAOImpl<BlockListDTO> implements BlockListDAOInt {

	@Override
	public Class<BlockListDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return BlockListDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(BlockListDTO dto, CriteriaBuilder criteriaBuilder, Root<BlockListDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getBlockCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("blockCode"), dto.getBlockCode() + "%"));
		}
		if (!isEmptyString(dto.getUserName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}
		if (!isEmptyString(dto.getReason())) {
			conditions.add(criteriaBuilder.like(qRoot.get("reason"), dto.getReason() + "%"));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(BlockListDTO dto, UserContext userContext) {
	}
}