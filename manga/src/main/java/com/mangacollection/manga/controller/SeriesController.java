package com.mangacollection.manga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mangacollection.manga.model.Series;
import com.mangacollection.manga.model.User;
import com.mangacollection.manga.service.SeriesService;
import com.mangacollection.manga.service.UserService;

@RestController
@RequestMapping("/series")
public class SeriesController {
    @Autowired private SeriesService service;
    @PostMapping
    public Series CreateSeries(@RequestBody Series series) {return service.CreateSeries(series);  }
}
