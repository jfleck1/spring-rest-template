package com.brushmtsys.templates.spring.rest;

import com.brushmtsys.templates.spring.rest.controllers.BeerReceipeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by justin on 10/18/16.
 */
@EnableAutoConfiguration
public class BeerReceipeApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BeerReceipeApp.class, args);
    }
}
