package com.mustafaergan.ServerManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafaergan.ServerManagement.dao.ContactDao;
import com.mustafaergan.ServerManagement.dao.SunucuDao;
import com.mustafaergan.ServerManagement.entity.Contact;
import com.mustafaergan.ServerManagement.entity.Server;

@Service
public class SunucuService {
	
	@Autowired
	SunucuDao sunucuDao;
	
	@Autowired
	ContactDao contactDao;
	
	public String sunucuIsmiVer(){
		return "Linux";
	}
	
	public void sunucuEkle(Server server){
		sunucuDao.save(server);
	}
	
	public void iletisimEkle(Contact contact){
		contactDao.save(contact);
	}

	public List<Server> getSunucuList() {
		return (List<Server>) sunucuDao.findAll();
	}
	
}
