package com.mangacollection.manga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mangacollection.manga.model.Series;
import com.mangacollection.manga.repository.SeriesRepository;

@Service
public class SeriesService {
    @Autowired private SeriesRepository repository;
    public Series CreateSeries(Series series){
        return repository.insert(series);
    }
}
