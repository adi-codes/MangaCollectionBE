package com.mangacollection.manga.repository;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.mangacollection.manga.model.MangaCollection;
import com.mangacollection.manga.model.Series;
import com.mangacollection.manga.model.User;

@Repository
@Document(collection = "Series")
public interface SeriesRepository extends MongoRepository<Series,String> {3
}
