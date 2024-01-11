package com.example.springwebflux.controller;

import com.example.springwebflux.domain.Anime;
import com.example.springwebflux.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/animes")
public class AnimeController {

    private final AnimeRepository animeRepository;

    @Autowired
    public AnimeController(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }

    @GetMapping
    public Flux<Anime> listAll() {
        return animeRepository.findAll();
    }
}
