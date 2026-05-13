package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_TRANSLATE")
public class TranslateDTO extends BaseDTO {

	@Column(name = "SOURCE_LANGUAGE", length = 50)
	private String sourceLanguage;
	
	@Column(name = "TARGET_LANGUAGE", length = 50)
	private String targetLanguage;
	
	@Column(name = "INPUT_TEXT", length = 50)
	private String inputText;
	
	@Column(name = "TRANSLATED_TEXT", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return sourceLanguage;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "sourceLanguage";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return sourceLanguage;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Source Language";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Translate";
	}
}