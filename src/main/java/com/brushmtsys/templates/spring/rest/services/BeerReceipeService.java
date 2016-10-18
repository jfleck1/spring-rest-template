package com.brushmtsys.templates.spring.rest.services;

import com.brushmtsys.templates.spring.rest.model.BeerReceipe;

/**
 * Created by justin on 10/18/16.
 */
public interface BeerReceipeService {
    BeerReceipe read(String name);
}
