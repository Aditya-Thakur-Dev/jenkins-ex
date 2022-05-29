package com.microex.movieinfoservice.controllers;

import com.microex.movieinfoservice.models.Movie;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class MovieInfoControllerTest {

    @InjectMocks
    private MovieInfoController controller;

    @Mock
    private Logger logger;

    @BeforeEach
    public void setUp(){
        ReflectionTestUtils.setField(controller, "logger", logger);
    }

    @Test
    public void basicTest(){
        //given
        //when
        Movie m = controller.getMovies("1");

        //then
        assertEquals(m.getName(), "Transformers");
        Mockito.verify(logger, Mockito.times(1)).info("Movie id {} ", "1");
    }

}