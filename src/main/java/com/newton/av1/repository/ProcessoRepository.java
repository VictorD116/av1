package com.newton.av1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.newton.av1.entity.Processo;



public interface ProcessoRepository extends MongoRepository<Processo, String>{
}
