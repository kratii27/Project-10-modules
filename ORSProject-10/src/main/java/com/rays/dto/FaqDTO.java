package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_FAQ")
public class FaqDTO extends BaseDTO {

	@Column(name = "FAQ_CODE", length = 50)
	private String faqCode;
	
	@Column(name = "QUESTION", length = 50)
	private String question;
	
	@Column(name = "ANSWER", length = 50)
	private String answer;
	
	@Column(name = "STATUS", length = 50)
	private String status;

	public String getFaqCode() {
		return faqCode;
	}
	public void setFaqCode(String faqCode) {
		this.faqCode = faqCode;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return faqCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "faqCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return faqCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Faq Code";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Faq";
	}
}