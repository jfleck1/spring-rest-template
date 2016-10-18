package com.brushmtsys.templates.spring.rest.services;

import com.brushmtsys.templates.spring.rest.model.BeerReceipe;
import com.brushmtsys.templates.spring.rest.model.BeerStyle;

/**
 * Created by justin on 10/18/16.
 */
public class DBBeerReceipeService implements BeerReceipeService {

    @Override
    public BeerReceipe read(String name) {
        BeerReceipe myReceipe = new BeerReceipe();
        myReceipe.setName("Coors");
        myReceipe.setStyle(BeerStyle.IPA);

        return myReceipe;
    }
}
