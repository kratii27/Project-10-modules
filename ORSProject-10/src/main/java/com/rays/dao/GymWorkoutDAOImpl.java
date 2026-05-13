package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.GymWorkoutDTO;

@Repository
public class GymWorkoutDAOImpl extends BaseDAOImpl<GymWorkoutDTO> implements GymWorkoutDAOInt {

	@Override
	public Class<GymWorkoutDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return GymWorkoutDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(GymWorkoutDTO dto, CriteriaBuilder criteriaBuilder, Root<GymWorkoutDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getMemberName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("memberName"), dto.getMemberName() + "%"));
		}
		if (!isEmptyString(dto.getWorkoutType())) {
			conditions.add(criteriaBuilder.like(qRoot.get("workoutType"), dto.getWorkoutType() + "%"));
		}
		if (!isEmptyString(dto.getTrainerName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("trainerName"), dto.getTrainerName() + "%"));
		}
		if (!isEmptyString(dto.getSchedule())) {
			conditions.add(criteriaBuilder.like(qRoot.get("schedule"), dto.getSchedule() + "%"));
		}

		return conditions;
	}

	@Override
	protected void populate(GymWorkoutDTO dto, UserContext userContext) {
	}
}