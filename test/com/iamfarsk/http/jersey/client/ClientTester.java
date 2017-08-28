package com.iamfarsk.http.jersey.client;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.Test;

import com.iamfarsk.http.jersey.client.Client;
import com.iamfarsk.http.jersey.entity.Accounts;
import com.iamfarsk.http.jersey.entity.IfConfig;
import com.iamfarsk.http.jersey.request.Request;
import com.iamfarsk.http.jersey.request.Request.METHOD;

public class ClientTester {

	
	@Test
	public void testIfConfig() {
		String  url = "http://ifconfig.co/json";
		Request request = new Request.Builder(METHOD.GET,url).build();
		Response response = Client.send(request);
		System.out.println(response.readEntity(IfConfig.class));
	}
	
	@Test
	public void testIfConfigJson() {
		String  url = "http://ifconfig.co/json";
		Request request = new Request.Builder(METHOD.GET,url).build();
		Response response = Client.send(request);
		System.out.println(response.readEntity(IfConfig.class));
		
	}
	
	@Test
	public void testAddAccountConnection(){
		String url = "http://localhost:2002/connections/2/customers/4/institutions/1/accounts/add";
//		String target = "https://www.starbucks.com/account/signin";
//		String target = "http://localhost:2002/connections/account";
		List<String> accept = new ArrayList<>();
		accept.add(MediaType.APPLICATION_JSON);
//		Map<String,String> headers = new HashMap<>();
		
		Request request = new Request.Builder(METHOD.POST,url)
				.accept(MediaType.APPLICATION_JSON)
//				.headers(headers)
				.build();
		
		Response response = Client.send(request);
		Accounts accounts = response.readEntity(Accounts.class);
		System.out.println(accounts);
		response = Client.send(request);
		System.out.println(response.readEntity(String.class));
	}

}
