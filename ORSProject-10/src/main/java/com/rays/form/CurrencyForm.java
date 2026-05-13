package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;
import com.rays.dto.CurrencyDTO;

public class CurrencyForm extends BaseForm<CurrencyDTO> {

	@NotEmpty(message = "Currency Code is Required")
	private String currencyCode;
	
	@NotEmpty(message = "Currency Name is Required")
	private String currencyName;
	
	@NotEmpty(message = "Symbol is Required")
	private String symbol;
	
	@NotEmpty(message = "Status is Required")
	private String status;

	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public CurrencyDTO getDto() {
		CurrencyDTO dto = initDTO(new CurrencyDTO());
		dto.setCurrencyCode(currencyCode);
		dto.setCurrencyName(currencyName);
		dto.setSymbol(symbol);
		dto.setStatus(status);
		return dto;
	}
}