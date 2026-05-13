package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.FaqDTO;

public class FaqForm extends BaseForm<FaqDTO> {

	@NotEmpty(message = "Faq Code is Required")
	private String faqCode;
	
	@NotEmpty(message = "Question is Required")
	private String question;
	
	@NotEmpty(message = "Answer is Required")
	private String answer;
	
	@NotEmpty(message = "Status is Required")
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
	public FaqDTO getDto() {
		FaqDTO dto = initDTO(new FaqDTO());
		dto.setFaqCode(faqCode);
		dto.setQuestion(question);
		dto.setAnswer(answer);
		dto.setStatus(status);
		return dto;
	}
}