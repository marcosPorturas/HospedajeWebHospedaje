package com.hospedaje.web.hospedaje.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hospedaje.web.hospedaje.entity.Hospedaje;

@Repository
@Transactional
public interface HospedajeRepository extends ReactiveMongoRepository<Hospedaje,Integer>{

}
