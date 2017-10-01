package com.mustafaergan.ServerManagement.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
public @Data class Yonetici {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	
	String isim;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "yonetici_person", 
	joinColumns = @JoinColumn(name = "yonetici_id"),
	inverseJoinColumns = @JoinColumn(name = "person_id"))
	List<Person> personList = new ArrayList<>();
	

}
