package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.RewardDTO;

@Repository
public class RewardDAOImpl extends BaseDAOImpl<RewardDTO> implements RewardDAOInt {

	@Override
	public Class<RewardDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return RewardDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(RewardDTO dto, CriteriaBuilder criteriaBuilder, Root<RewardDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getRewardCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("rewardCode"), dto.getRewardCode() + "%"));
		}
		if (!isEmptyString(dto.getUserName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("userName"), dto.getUserName() + "%"));
		}
		if (isNotNull(dto.getRewardAmount())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("rewardAmount"), dto.getRewardAmount()));
		}
		if (!isEmptyString(dto.getRewardType())) {
			conditions.add(criteriaBuilder.like(qRoot.get("rewardType"), dto.getRewardType() + "%"));
		}
		if (!isEmptyString(dto.getRewardStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("rewardStatus"), dto.getRewardStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(RewardDTO dto, UserContext userContext) {
	}
}