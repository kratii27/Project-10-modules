package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.TranslateDTO;

public class TranslateForm extends BaseForm<TranslateDTO> {

	@NotEmpty(message = "Source Language is Required")
	private String sourceLanguage;
	
	@NotEmpty(message = "Target Language is Required")
	private String targetLanguage;
	
	@NotEmpty(message = "Input Text is Required")
	private String inputText;
	
	@NotEmpty(message = "Translated Text is Required")
	private String translatedText;

	public String getSourceLanguage() {
		return sourceLanguage;
	}
	public void setSourceLanguage(String sourceLanguage) {
		this.sourceLanguage = sourceLanguage;
	}
	public String getTargetLanguage() {
		return targetLanguage;
	}
	public void setTargetLanguage(String targetLanguage) {
		this.targetLanguage = targetLanguage;
	}
	public String getInputText() {
		return inputText;
	}
	public void setInputText(String inputText) {
		this.inputText = inputText;
	}
	public String getTranslatedText() {
		return translatedText;
	}
	public void setTranslatedText(String translatedText) {
		this.translatedText = translatedText;
	}

	@Override
	public TranslateDTO getDto() {
		TranslateDTO dto = initDTO(new TranslateDTO());
		dto.setSourceLanguage(sourceLanguage);
		dto.setTargetLanguage(targetLanguage);
		dto.setInputText(inputText);
		dto.setTranslatedText(translatedText);
		return dto;
	}
}