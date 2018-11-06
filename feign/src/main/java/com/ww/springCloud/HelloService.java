package com.ww.springCloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "BOOT-SERVER")
public interface HelloService {

	@RequestMapping("/ww/rest/test1")
	public String getHelloContent();
	
	@RequestMapping("/ww/rest/test2")
	public String getHelloContent(@RequestParam("text") String text);
}

