package com.BalajiIT.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BalajiIT.entities.CityMasterEntity;

public interface CityRepository extends JpaRepository<CityMasterEntity, Serializable> {

}
