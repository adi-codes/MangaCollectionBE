package com.mangacollection.manga.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mangacollection.manga.model.MangaCollection;
import com.mangacollection.manga.model.User;
import com.mangacollection.manga.service.MangaCollectionService;
import com.mangacollection.manga.service.UserService;

@RestController
@RequestMapping("/mangaCollection")
public class MangaCollectionController {
    @Autowired private MangaCollectionService service;
    @GetMapping("/{userId}")
    public List<MangaCollection> getMangaCollectionByUserId(@PathVariable("userId") String userId){ return service.getMangaCollectionUsingUserId(userId); }
}
