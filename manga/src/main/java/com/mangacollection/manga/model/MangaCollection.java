package com.mangacollection.manga.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "MangaCollection")
public class MangaCollection {

    @Id
    @JsonProperty("id")
    private String id;

    @JsonProperty("seriesId")
    private String seriesId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("userId")
    private String userId;

    @JsonProperty("books")
    private List<MangaCollectionBooks> books;

}
