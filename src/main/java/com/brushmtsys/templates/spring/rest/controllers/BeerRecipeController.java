package com.brushmtsys.templates.spring.rest.controllers;

import com.brushmtsys.templates.spring.rest.model.BeerRecipe;
import com.brushmtsys.templates.spring.rest.services.BeerRecipeService;
import com.brushmtsys.templates.spring.rest.services.FileSystemBeerRecipeService;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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

    @RequestMapping(value = "/BeerRecipe")
    @ResponseBody
    BeerRecipe getBeerRecipe(String name) {
        return beerRecipeService.read(name);
    }

    @RequestMapping("/schema/BeerRecipe")
    @ResponseBody
    JsonSchema getBeerRecipeSchema() throws JsonMappingException {
        ObjectMapper mapper = new ObjectMapper();
        // configure mapper, if necessary, then create schema generator
        JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
        JsonSchema schema = schemaGen.generateSchema(BeerRecipe.class);
        return schema;
    }
}
