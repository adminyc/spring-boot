package cn.cssl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import cn.cssl.pojo.User;
import cn.cssl.service.MyService;

@Controller
public class MyController {
	public MyController() {
		System.out.println("这是MyController的无参构造...");
	}
	@Autowired
	private MyService ms;
	
	@PostMapping("form1")
	public String registUser(User ur) {
		System.out.println(ur);
		int i = ms.adduser(ur);
		if(i>0) {
			return "registyes";
		}
		return "index";
	}
}
