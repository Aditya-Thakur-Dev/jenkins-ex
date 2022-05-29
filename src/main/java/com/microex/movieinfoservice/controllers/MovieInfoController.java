package com.microex.movieinfoservice.controllers;

import com.microex.movieinfoservice.models.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

    public static Logger logger = LoggerFactory.getLogger(MovieInfoController.class);
    @RequestMapping("{movieId}")
    public Movie getMovies(@PathVariable("movieId") String movieId){
        logger.info("Movie id {} ", movieId);
        return new Movie(movieId, "Transformers");
    }
}
