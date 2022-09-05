package com.BalajiIT.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BalajiIT.entities.UserAccountEntity;

public interface UserAccountRepository extends JpaRepository<UserAccountEntity, Serializable> {

}
