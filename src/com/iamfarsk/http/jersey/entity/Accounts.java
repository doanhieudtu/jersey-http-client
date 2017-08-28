package com.iamfarsk.http.jersey.entity;

import java.util.Collection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name="accounts")
public class Accounts implements CCEntity{
	private Integer institutionid;
	private Integer customerid;
	private Collection<Account> accounts;
	private Integer status;

	public Integer getInstitutionid() {
		return institutionid;
	}
	public void setInstitutionid(Integer institutionid) {
		this.institutionid = institutionid;
	}
	public Integer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	@XmlElement(name = "account") 
	@JsonProperty("accounts")
	public Collection<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Collection<Account> accounts) {
		this.accounts = accounts;
	}

	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Accounts [institutionid=" + institutionid + ", customerid=" + customerid + ", accounts=" + accounts
				+ ", status=" + status + "]";
	}
	
	
}
