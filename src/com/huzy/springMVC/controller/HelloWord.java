package com.huzy.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWord {

	/** 
	  * @���ߣ�huzy
	  * @ʱ�䣺2017��12��18������11:17:23
	  * 1��ͨ��@RequestMappingע����ӳ�������URL
	  * 2������ֵͨ����ͼ������������Ϊʵ�ʵ�������ͼ, ���� InternalResourceViewResolver ��ͼ������, �������µĽ���:
	  * ͨ�� prefix + returnVal + ��׺ �����ķ�ʽ�õ�ʵ�ʵ�������ͼ, Ȼ����ת������
	**/
	@RequestMapping("/helloWord")
	public String hello() {
		System.out.println("HelloWord");
		return "success";
	}
}
