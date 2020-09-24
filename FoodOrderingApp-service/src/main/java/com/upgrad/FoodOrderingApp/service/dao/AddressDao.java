package com.upgrad.FoodOrderingApp.service.dao;

import com.upgrad.FoodOrderingApp.service.entity.AddressEntity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class AddressDao {

  @PersistenceContext
  private EntityManager entityManager;


  public AddressEntity createAddress(AddressEntity addressEntity) {
    entityManager.persist(addressEntity);
    return addressEntity;
  }

}