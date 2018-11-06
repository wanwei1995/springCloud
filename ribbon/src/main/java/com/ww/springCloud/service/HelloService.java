package com.ww.springCloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	public String getHelloContent() {
		String t =  restTemplate.getForObject("http://BOOT-SERVER/ww/rest/test1", String.class);
		System.out.println(t);
		return t;
	}
}

