package cn.xjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrintController {

	
	@RequestMapping("/print/{messager}")
	public String hello(@PathVariable String messager){
		
		System.out.println(messager + "shh2222" + "2" + "1" + "1" + "3");
		System.out.println("2");
		
		
		System.out.println("5");
		
		return "/index.jsp";
	}
	
}