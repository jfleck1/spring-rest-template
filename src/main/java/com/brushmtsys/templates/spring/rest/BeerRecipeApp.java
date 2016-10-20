package com.brushmtsys.templates.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is the main bootstrap class for the application
 *
 * Created by justin on 10/18/16.
 */
@EnableAutoConfiguration
@SpringBootApplication
public class BeerRecipeApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BeerRecipeApp.class, args);
    }
}
