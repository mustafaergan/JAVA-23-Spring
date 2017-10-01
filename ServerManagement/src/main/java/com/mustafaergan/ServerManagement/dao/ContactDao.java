package com.mustafaergan.ServerManagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.mustafaergan.ServerManagement.entity.Contact;

public interface ContactDao extends CrudRepository<Contact, Integer> {

}
