package com.mangacollection.manga.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "Series")
public class Series {
    @Id
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("author")
    private List<String> author;

    @JsonProperty("publisher")
    private String publisher;

    @JsonProperty("books")
    private List<Books> books;
}
