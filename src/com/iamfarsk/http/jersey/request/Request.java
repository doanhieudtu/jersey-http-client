package com.iamfarsk.http.jersey.request;

import java.util.HashMap;
import java.util.Map;

public class Request {

	private String method;
	private String url;
	private String accept;
	private Map<String,String> headers;
	private String body;

	private Request(Builder builder){
		this.method = builder.method;
		this.url = builder.url;
		this.accept = builder.accept;
		this.headers = builder.headers;
		this.body = builder.body;
	}

	public String getMethod() {
		return method;
	}

	public String getUrl() {
		return url;
	}
	
	public String getAccept() {
		return accept;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public String getBody() {
		return body;
	}

	public static class Builder{

		private String method;
		private String url;
		private String accept;
		private Map<String,String> headers = new HashMap<String,String>();
		private String body;

		public Builder(METHOD method, String url){
			this.method = method.name();
			this.url = url;
		}

		public Builder accept(String accept) {
			this.accept = accept;
			return this;
		}

		public Builder headers(Map<String, String> headers) {
			this.headers = headers;
			return this;
		}

		public Builder body(String body) {
			this.body = body;
			return this;
		}

		public Request build(){
			return new Request(this);
		}

	}
	
	public enum METHOD{
		GET,POST,PUT,DELETE,HEAD,OPTIONS,TRACE,CONNECT
	}

}

