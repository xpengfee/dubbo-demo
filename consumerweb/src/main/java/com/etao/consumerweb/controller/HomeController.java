package com.etao.consumerweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {
	private static final String page_index = "/home/index";
	@Autowired(required = true)
	private com.etao.dubbo.api.DemoService demoService;
	
	@RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(ModelMap model){
		String result=demoService.sayHello("consumeweb");
		model.addAttribute("msg", "Hello world!xxxxxxxx"+result);
        return page_index;
        
    }
}
