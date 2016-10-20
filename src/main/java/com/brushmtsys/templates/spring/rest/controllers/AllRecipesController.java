package com.brushmtsys.templates.spring.rest.controllers;

import com.brushmtsys.templates.spring.rest.model.ExternalBeerRecipe;
import com.brushmtsys.templates.spring.rest.services.ExternalBeerRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Controller for retrieving all beer recipes
 * from an external service
 *
 * Created by ealexhaywood on 10/20/16.
 */
@Controller
public class AllRecipesController {


    @Autowired
    private ExternalBeerRecipeService externalRecipeService;

    @RequestMapping(method = RequestMethod.GET, value = "/AllRecipes")
    @ResponseBody
    List<ExternalBeerRecipe> getAllRecipes() {
        return externalRecipeService.read();
    }

}
