package com.BalajiIT.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BalajiIT.entities.CountryMasterEntity;

public interface CountryRepository extends JpaRepository<CountryMasterEntity, Serializable> {

}
