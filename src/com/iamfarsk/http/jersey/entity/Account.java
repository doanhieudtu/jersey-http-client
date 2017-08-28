package com.iamfarsk.http.jersey.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name="account")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account implements CCEntity{

	private Integer id;
	private Integer type;
	private String name;
	private String accountnumber;
	private String status;
	@JsonProperty("balance")
	private BigDecimal balanceAmount; 
	private Date balanceDate; 
	private Integer institutionLoginId;

	public Account(){
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	@XmlElement(name="balance")
	@JsonProperty("balance")
	public BigDecimal getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(BigDecimal balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	
	public Date getBalanceDate() {
		return balanceDate;
	}
	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}
	
	public Integer getInstitutionLoginId() {
		return institutionLoginId;
	}
	public void setInstitutionLoginId(Integer institutionLoginId) {
		this.institutionLoginId = institutionLoginId;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", type=" + type + ", name=" + name + ", accountnumber=" + accountnumber
				+ ", status=" + status + ", balanceAmount=" + balanceAmount + ", balanceDate=" + balanceDate
				+ ", institutionLoginId=" + institutionLoginId + "]";
	}
	
	
}
