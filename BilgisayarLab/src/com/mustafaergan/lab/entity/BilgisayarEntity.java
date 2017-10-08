package com.mustafaergan.lab.entity;

public class BilgisayarEntity {
	
	int id;
	String isim;
	String ip;
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIp() {
		return ip;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getIsim() {
		return isim;
	}

}
