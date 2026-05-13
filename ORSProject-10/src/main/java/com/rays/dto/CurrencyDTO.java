package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_CURRENCY")
public class CurrencyDTO extends BaseDTO {

	@Column(name = "CURRENCY_CODE", length = 50)
	private String currencyCode;
	
	@Column(name = "CURRENCY_NAME", length = 50)
	private String currencyName;
	
	@Column(name = "SYMBOL", length = 50)
	private String symbol;
	
	@Column(name = "STATUS", length = 50)
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
	public String getValue() {
		// TODO Auto-generated method stub
		return currencyCode;
	}
	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "currencyCode";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return currencyCode;
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Currency Code";
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Currency";
	}
}