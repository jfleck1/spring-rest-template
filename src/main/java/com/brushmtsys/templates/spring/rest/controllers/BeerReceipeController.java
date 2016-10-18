package com.brushmtsys.templates.spring.rest.controllers;

import com.brushmtsys.templates.spring.rest.model.BeerReceipe;
import com.brushmtsys.templates.spring.rest.services.BeerReceipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by justin on 10/18/16.
 */
@Controller
public class BeerReceipeController {

    @Autowired
    private BeerReceipeService beerReceipeService;

    @RequestMapping("/")
    @ResponseBody
    BeerReceipe getBeerReceipe(String name) {
        return beerReceipeService.read(name);
    }


}
