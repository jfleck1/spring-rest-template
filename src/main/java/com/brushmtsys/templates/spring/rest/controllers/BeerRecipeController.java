package com.brushmtsys.templates.spring.rest.controllers;

import com.brushmtsys.templates.spring.rest.model.BeerRecipe;
import com.brushmtsys.templates.spring.rest.services.BeerRecipeService;
import com.brushmtsys.templates.spring.rest.services.FileSystemBeerRecipeService;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;
import com.fasterxml.jackson.module.jsonSchema.factories.JsonSchemaFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by justin on 10/18/16.
 */
@Controller
public class BeerRecipeController {

    @Autowired
    @Qualifier("fileSystemBeerRecipeService")
    private BeerRecipeService beerRecipeService;

    @RequestMapping("/BeerRecipe")
    @ResponseBody
    BeerRecipe getBeerRecipe(String name) {
        return beerRecipeService.read(name);
    }

    @RequestMapping("/BeerRecipe/schema")
    @ResponseBody
    JsonSchema getBeerRecipeSchema(String name) {
//        JsonSchema result = null;
//        JsonSchemaGenerator generator = JsonSchemaGenerator;
//
//
        return null;
    }
}
