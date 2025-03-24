package com.mangacollection.manga.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MangaCollectionBooks {

    @JsonProperty("volumeNo")
    private Integer volumeNo;

    @JsonProperty("cost")
    private float cost;

    @JsonProperty("source")
    private String source;

    @JsonProperty("dateAcquired")
    private int dateAcquired;
}
