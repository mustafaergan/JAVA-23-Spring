package com.mustafaergan.ServerManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mustafaergan.ServerManagement.service.SunucuService;


@Controller
@RequestMapping(path = "/main")
public class MainController {
	
	@Autowired
	SunucuService sunucuService;
	

	@GetMapping(path = "/hello")
	@ResponseBody
	public String helloWorld() {
		return sunucuService.sunucuIsmiVer();
	}
	
   @RequestMapping("/index.java")
    public String index(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "merhabaspringboot";
    }
   
   
   @RequestMapping("/login.java")
   public String login(@RequestParam(value="name") String name, Model model) {
       model.addAttribute("name", name);
       if(name.equals("23")){
           model.addAttribute("sinif","Java-23");
           model.addAttribute("okul","vektorel");  
       }else if (name.equals("24")){
    	   model.addAttribute("sinif","C#-24");
           model.addAttribute("okul","Vektorel"); 
       }
       return "login";
   }
	
	
   @RequestMapping("/anasayfa.java")
   public String anasayfa(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
       model.addAttribute("name", name);
       return "index";
   }
   
   @RequestMapping("/userlogin.java")
   public String userlogin(Model model) {
       return "myform";
   }
   
   @RequestMapping("/user.java")
   public String user(@RequestParam(value="kulAdi") String kul,
		   @RequestParam(value="sifre")String sifre, Model model) {
	   if(kul.equals("leprax") && sifre.equals("1234")){
		   return "user";
	   }else{
		   return "fail";
	   }
   }
	
}
