package com.iamfarsk.http.jersey.client;

import java.util.Map;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;

import com.iamfarsk.http.jersey.request.Request;
import com.iamfarsk.http.jersey.util.MapUtil;

public class Client {
	
	private static final javax.ws.rs.client.Client client = ClientBuilder
			.newClient(new ClientConfig()
			.register(LoggingFilter.class));
	
	public static Response send(Request request){
//		Map headers = request.getHeaders();
		WebTarget webTarget = client.target(request.getUrl());
		Invocation.Builder invocationBuilder =  webTarget
												.request()
												.accept(request.getAccept())
												.headers(MapUtil.toMultivaluedMap(request.getHeaders()));
		
//		headers.entrySet().forEach(entry -> invocationBuilder.header(entry.getKey(), entry.getValue()));
//		for (Map.Entry<String, String> entry : headers.entrySet()) {
//			invocationBuilder.header(entry.getKey(), entry.getValue());
//		}
		Response response = invocationBuilder.method(request.getMethod());
		return response;
	}
	
}
