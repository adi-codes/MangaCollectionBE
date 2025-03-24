package com.mangacollection.manga.repository;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;


import com.mangacollection.manga.model.User;

@Repository
@Document(collection = "User")
public interface UserRepository  extends MongoRepository<User,String> {
    
}
