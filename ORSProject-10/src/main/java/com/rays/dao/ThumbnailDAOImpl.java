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
import com.rays.dto.ThumbnailDTO;
import com.rays.dto.UserDTO;

@Repository
public class ThumbnailDAOImpl extends BaseDAOImpl<ThumbnailDTO> implements ThumbnailDAOInt {
	
	@Override
	public Class<ThumbnailDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return ThumbnailDTO.class;
	}
	
	@Override
	public List<Predicate> getWhereClause(ThumbnailDTO dto, CriteriaBuilder criteriaBuilder, Root<ThumbnailDTO> qRoot) {
		
		List<Predicate> conditions = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getThumbnailCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("thumbnailCode"), dto.getThumbnailCode() + "%"));
		}
		if (!isEmptyString(dto.getFileName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("fileName"), dto.getFileName() + "%"));
		}
		if (!isEmptyString(dto.getResolution())) {
			conditions.add(criteriaBuilder.like(qRoot.get("resolution"), dto.getResolution() + "%"));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}
		
		return conditions;
	}
	
	@Override
	protected void populate(ThumbnailDTO dto, UserContext userContext) {
		// TODO: Add custom populate logic if needed
	}
}