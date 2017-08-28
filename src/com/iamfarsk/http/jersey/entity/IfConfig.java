package com.iamfarsk.http.jersey.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IfConfig {
	
	private String city;
	private String country;
	private String hostname;
	private String ip;
	private String ipDecimal;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	@JsonProperty("ip_decimal")
	public String getIpDecimal() {
		return ipDecimal;
	}
	public void setIpDecimal(String ipDecimal) {
		this.ipDecimal = ipDecimal;
	}
	
	@Override
	public String toString() {
		return 	"City : " + city + "\n" +
				"Country : " + country + "\n" +
				"Host Name : " + hostname + "\n" +
				"IP : " + ip + "\n" +
				"IP Decimal : " + ipDecimal + "\n";
	}
	
}
