package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.QueueListenerDTO;

@Repository
public class QueueListenerDAOImpl extends BaseDAOImpl<QueueListenerDTO> implements QueueListenerDAOInt {

	@Override
	public Class<QueueListenerDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return QueueListenerDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(QueueListenerDTO dto, CriteriaBuilder criteriaBuilder, Root<QueueListenerDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getListenerCode())) {
			conditions.add(criteriaBuilder.like(qRoot.get("listenerCode"), dto.getListenerCode() + "%"));
		}
		if (!isEmptyString(dto.getQueueName())) {
			conditions.add(criteriaBuilder.like(qRoot.get("queueName"), dto.getQueueName() + "%"));
		}
		if (!isEmptyString(dto.getConsumerGroup())) {
			conditions.add(criteriaBuilder.like(qRoot.get("consumerGroup"), dto.getConsumerGroup() + "%"));
		}
		if (!isEmptyString(dto.getStatus())) {
			conditions.add(criteriaBuilder.like(qRoot.get("status"), dto.getStatus()));
		}

		return conditions;
	}

	@Override
	protected void populate(QueueListenerDTO dto, UserContext userContext) {
	}
}