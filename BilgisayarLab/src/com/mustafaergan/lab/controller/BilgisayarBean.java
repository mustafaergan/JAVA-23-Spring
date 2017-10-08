package com.mustafaergan.lab.controller;

import java.util.ArrayList;
import java.util.List;
import com.mustafaergan.lab.entity.BilgisayarEntity;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BilgisayarBean {
	
	List<BilgisayarEntity> bilgisayar = new ArrayList<>();
	
//	public BilgisayarBean() {
//		
//	}
	
	@PostConstruct
	public void init() {
		BilgisayarEntity bilgisayarEntity = new BilgisayarEntity();
		bilgisayarEntity.setId(0);
		bilgisayarEntity.setIsim("Lab-4-11");
		bilgisayarEntity.setIp("100.0.0.0");
		
		BilgisayarEntity bilgisayarEntity2 = new BilgisayarEntity();
		bilgisayarEntity2.setId(2);
		bilgisayarEntity2.setIsim("Lab-4-10");
		bilgisayarEntity2.setIp("100.0.0.1");
		
		bilgisayar.add(bilgisayarEntity);
		bilgisayar.add(bilgisayarEntity2);
		
	}
	
	
	public void setBilgisayar(List<BilgisayarEntity> bilgisayar) {
		this.bilgisayar = bilgisayar;
	}
	
	public List<BilgisayarEntity> getBilgisayar() {
		return bilgisayar;
	}

}
