package com.iamfarsk.http.jersey.util;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.MultivaluedMap;

import org.junit.Test;

import com.iamfarsk.http.jersey.util.MapUtil;

public class MapUtilTester {
	
	@Test
	public void testToMultivaluedMap(){
		Map<String,String> map = new HashMap<>();
		map.put("Yaduraj", "Daaku");
		map.put("Farhan", "smarty");
		
		MultivaluedMap<String, Object> mvm = MapUtil.toMultivaluedMap(map);
		mvm.entrySet().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
	}

}
