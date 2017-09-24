package com.mustafaergan.ServerManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path = "/main")
public class MainController {

	@GetMapping(path = "/hello")
	@ResponseBody
	public String helloWorld() {
		return "Hello World";
	}
	
   @RequestMapping("/index.java")
    public String index(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "merhabaspringboot";
    }
   
   @RequestMapping("/login.java")
   public String login(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
       model.addAttribute("name", name);
       return "login";
   }
	
	
	
	
}
