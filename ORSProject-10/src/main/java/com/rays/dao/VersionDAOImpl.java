package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.VersionDTO;

@Repository
public class VersionDAOImpl extends BaseDAOImpl<VersionDTO> implements VersionDAOInt {

	@Override
	public Class<VersionDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return VersionDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(VersionDTO dto, CriteriaBuilder criteriaBuilder, Root<VersionDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getVersionCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("versionCode"), dto.getVersionCode() + "%"));
		}
		if (!isEmptyString(dto.getVersionName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("versionName"), dto.getVersionName() + "%"));
		}
		if (isNotNull(dto.getReleaseDate())) {
			conditions.add(criteriaBuilder.equal(qRoot.get("releaseDate"), dto.getReleaseDate()));
		}
		if (!isEmptyString(dto.getVersionStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("versionStatus"), dto.getVersionStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(VersionDTO dto, UserContext userContext) {
	}
}