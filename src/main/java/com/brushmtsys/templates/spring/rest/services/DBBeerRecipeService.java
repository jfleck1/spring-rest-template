package com.brushmtsys.templates.spring.rest.services;

import com.brushmtsys.templates.spring.rest.model.BeerRecipe;
import com.brushmtsys.templates.spring.rest.model.BeerStyle;
import org.springframework.stereotype.Service;

/**
 * Created by justin on 10/18/16.
 */
@Service
public class DBBeerRecipeService implements BeerRecipeService {

    @Override
    public BeerRecipe read(String name) {
        BeerRecipe myRecipe = new BeerRecipe();
        myRecipe.setName("Coors");
        myRecipe.setStyle(BeerStyle.IPA);

        return myRecipe;
    }
}
