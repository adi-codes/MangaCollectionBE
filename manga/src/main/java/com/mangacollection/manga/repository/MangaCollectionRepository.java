package com.mangacollection.manga.repository;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mangacollection.manga.model.MangaCollection;

@Repository
@Document(collection = "MangaCollection")
public interface MangaCollectionRepository extends MongoRepository<MangaCollection,String>{
    List<MangaCollection> findAllByUserId(String userId);
}
