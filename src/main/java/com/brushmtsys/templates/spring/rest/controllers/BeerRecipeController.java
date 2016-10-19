package com.brushmtsys.templates.spring.rest.controllers;

import com.brushmtsys.templates.spring.rest.model.BeerRecipe;
import com.brushmtsys.templates.spring.rest.services.BeerRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by justin on 10/18/16.
 */
@Controller
public class BeerRecipeController {

    @Autowired
    @Qualifier("fileSystemBeerRecipeService")
    private BeerRecipeService beerRecipeService;

    @RequestMapping(method = RequestMethod.GET, value = "/BeerRecipe")
    @ResponseBody
    BeerRecipe get(String name) {
        return beerRecipeService.read(name);
    }


}
