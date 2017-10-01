package com.mustafaergan.ServerManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

/**
*@OneToOne(cascade = CascadeType.PERSIST)
*private Adres ad= new Adres(); 
*
*Tip	Tanım:
*PERSIST	Nesne persist edilirse alt nesne de persist edilir
*MERGE	Nesne merge edilirse alt nesne de merge edilir
*REMOVE	Nesne silinirse bağlı alt nesne de silinir
*REFRESH	Nesne yenilenirse bağlı alt nesne de yenilenir
*ALL	Tüm işlemler birlikte yapılır
*/

@Entity(name="Sunucu")
public @Data  class Server {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String ip;
	
	@ManyToOne
	Person assigneePerson;

}


