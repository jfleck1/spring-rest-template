package com.brushmtsys.templates.spring.rest.controllers;

import com.brushmtsys.templates.spring.rest.model.BeerRecipe;
import com.brushmtsys.templates.spring.rest.services.BeerRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by justin on 10/18/16.
 */
@Controller
public class BeerRecipeController {

    @Autowired
    private BeerRecipeService beerRecipeService;

    @RequestMapping("/beer")
    @ResponseBody
    BeerRecipe getBeerRecipe(String name) {
        return beerRecipeService.read(name);
    }


}
