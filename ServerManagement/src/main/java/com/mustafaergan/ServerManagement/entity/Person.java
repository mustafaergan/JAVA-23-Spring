package com.mustafaergan.ServerManagement.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
public @Data class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	String name;
	
	@OneToOne
	Adres adres;
	
	@ManyToMany(mappedBy = "personList")
	List<Yonetici> yoneticiList = new ArrayList<>();
	
}
