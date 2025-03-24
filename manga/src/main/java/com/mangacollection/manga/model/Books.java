package com.mangacollection.manga.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Books {
    @JsonProperty("volumeNo")
    private Integer volumeNo;

    @JsonProperty("isbn10")
    private String isbn10;

    @JsonProperty("isbn13")
    private String isbn13;    
}
