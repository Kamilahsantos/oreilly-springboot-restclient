package com.oreilly.restclient.services;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class JokeServiceTest {
    private Logger logger = LoggerFactory.getLogger(JokeService.class);

    @Autowired
    private JokeService service;

    @Test
    public void getJoke() {
        String joke = service.getJoke("Kamila", "Santos");
        logger.info(joke);
        assertTrue(joke.contains("Kamila") ||
                joke.contains("Santos"));
    }

    @Test
    void getJokeAsString() {
        System.out.println(service.getJokeAsString("Kamila", "Oliveira"));
    }
}