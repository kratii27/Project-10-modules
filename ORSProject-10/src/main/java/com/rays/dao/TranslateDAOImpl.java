package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.TranslateDTO;

@Repository
public class TranslateDAOImpl extends BaseDAOImpl<TranslateDTO> implements TranslateDAOInt {

	@Override
	public Class<TranslateDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return TranslateDTO.class;
	}

	@Override
	public List<Predicate> getWhereClause(TranslateDTO dto, CriteriaBuilder criteriaBuilder, Root<TranslateDTO> qRoot) {

		List<Predicate> conditions = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getSourceLanguage())) {
			conditions.add(criteriaBuilder.like(qRoot.get("sourceLanguage"), dto.getSourceLanguage() + "%"));
		}
		if (!isEmptyString(dto.getTargetLanguage())) {
			conditions.add(criteriaBuilder.like(qRoot.get("targetLanguage"), dto.getTargetLanguage() + "%"));
		}
		if (!isEmptyString(dto.getInputText())) {
			conditions.add(criteriaBuilder.like(qRoot.get("inputText"), dto.getInputText() + "%"));
		}
		if (!isEmptyString(dto.getTranslatedText())) {
			conditions.add(criteriaBuilder.like(qRoot.get("translatedText"), dto.getTranslatedText() + "%"));
		}

		return conditions;
	}

	@Override
	protected void populate(TranslateDTO dto, UserContext userContext) {
	}
}