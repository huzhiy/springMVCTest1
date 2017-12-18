package com.huzy.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWord {

	/** 
	  * @作者：huzy
	  * @时间：2017年12月18日下午11:17:23
	  * 1、通过@RequestMapping注解来映射请求的URL
	  * 2、返回值通过视图解析器跳解析为实际的物理视图, 对于 InternalResourceViewResolver 视图解析器, 会做如下的解析:
	  * 通过 prefix + returnVal + 后缀 这样的方式得到实际的物理视图, 然会做转发操作
	**/
	@RequestMapping("/helloWord")
	public String hello() {
		System.out.println("HelloWord");
		return "success";
	}
}
