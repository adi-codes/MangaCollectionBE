package com.mangacollection.manga.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.mangacollection.manga.model.MangaCollection;
import com.mangacollection.manga.model.User;
import com.mangacollection.manga.repository.MangaCollectionRepository;
import com.mongodb.client.MongoCollection;


@Service
public class MangaCollectionService {
    @Autowired
    private MangaCollectionRepository repository;
   // private MongoTemplate repo;
    public List<MangaCollection> getMangaCollectionUsingUserId(String userId){
        // Query query = new Query(Criteria.where("userId").is(userId));
        // return repo.find(query,MangaCollection.class);
        return repository.findAllByUserId(userId);
    }

}
