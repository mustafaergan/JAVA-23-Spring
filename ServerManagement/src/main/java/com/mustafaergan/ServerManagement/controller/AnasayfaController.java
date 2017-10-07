package com.mustafaergan.ServerManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mustafaergan.ServerManagement.service.SunucuService;


/**
 * 
 * @singleton Tüm bean ler standart olarak singleton scope kullanırlar
 * Bean nesnesi sadece bir kere oluşturulur ve her sorgulamada bu nesne kullanılır
 * 
 * @Prototype Singleton scope tam tersi Bean nesnesi her 
 * sorgulamada oluşturulur ve ayni nesne kullanilmaz
 *
 * 
 * @Web scopes (Request, Session, Global Session) Yalnızca web aksi halde IllegalStateException hatası alınır.
 *

 * @Request Her HTTP isteği için yeni bir bean yaratılır. HTTP isteği sona erince bean yok edilir
 * @Session HTTP session başlamasıyla oluşturulur ve session süresince değişmez.
 * @Global Session Sadece Portlet uygulamaları için kullanılır Web uygulamaları için kullanıldığı taktirde session scope görevi görür 
 * 
 * Not:
 * Portlet'ler içerik yönetim sisteminin en temel ve en küçük objelerinden biridir. Temel olarak portlet objesi bir html kodundan oluşur ve seçildiği zone'un içerisindeki article sayısına göre kendini tekrarlar. 
 * Portlet'ler tiplerine göre bir çok amaçla kullanılmaktadır.
 * 
 */




@Controller
public class AnasayfaController {
	
	@Autowired
	SunucuService sunucuService;
	
	@GetMapping(path = "/anasayfa.vek23")
	public String helloWorld(Model model) {
		return "index";
	}
	
	@GetMapping(path = "/menu")
	public String menu(Model model) {
		return "menu";
	}
	
	@GetMapping(path="/login.vek23")
	public String login(Model model){
		return "mahmut";
	}
	
	

}
