package com.alfaairlines.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alfaairlines.models.UserModel;

public interface IUserRepository extends MongoRepository <UserModel,String> { 
	
	

}
