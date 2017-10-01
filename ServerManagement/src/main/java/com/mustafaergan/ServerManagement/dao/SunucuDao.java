package com.mustafaergan.ServerManagement.dao;

import org.springframework.data.repository.CrudRepository;

import com.mustafaergan.ServerManagement.entity.Server;

public interface SunucuDao extends CrudRepository<Server, Integer> {

}
