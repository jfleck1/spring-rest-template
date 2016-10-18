package com.brushmtsys.templates.spring.rest.services;

import com.brushmtsys.templates.spring.rest.model.BeerRecipe;

/**
 * Created by justin on 10/18/16.
 */
public interface BeerRecipeService {
    BeerRecipe read(String name);
}
