package com.alfaairlines.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alfaairlines.models.PacoteModel;

public interface IPacoteRepository extends MongoRepository <PacoteModel,String>{

}
