package com.hospedaje.web.hospedaje.repository;



import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hospedaje.web.hospedaje.entity.HospedajeStatus;


@Repository
@Transactional
public interface HospedajeStatusRepository extends ReactiveMongoRepository<HospedajeStatus, Integer>{

}
