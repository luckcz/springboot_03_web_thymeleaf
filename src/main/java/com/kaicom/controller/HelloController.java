package com.kaicom.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "hello";
	}

	@RequestMapping("/success")
	public String success(Map<String,Object> map){
		map.put("hello", "<h1>你好</h1>");
		map.put("list", Arrays.asList("张三","李四","王五","赵柳","王麻子"));
		return "success";
	}
}
