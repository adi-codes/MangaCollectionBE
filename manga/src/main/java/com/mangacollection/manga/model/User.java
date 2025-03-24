package com.mangacollection.manga.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;
@Document(collection = "User")
public class User {
    @Id
    @JsonProperty("id")
    private String id;

    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("userName")
    private String userName;
    
    @JsonProperty("booksOwned")
    private Integer booksOwned;
}
