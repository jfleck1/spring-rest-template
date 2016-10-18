package com.brushmtsys.templates.spring.rest.services;

import com.brushmtsys.templates.spring.rest.model.BeerReceipe;
import com.brushmtsys.templates.spring.rest.model.BeerStyle;
import org.springframework.stereotype.Service;

/**
 * Created by justin on 10/18/16.
 */
@Service
public class FileSystemBeerReceipeService implements BeerReceipeService {

    @Override
    public BeerReceipe read(String name) {
        BeerReceipe myReceipe = new BeerReceipe();
        myReceipe.setName("Dale's Pale Ale");
        myReceipe.setStyle(BeerStyle.IPA);

        return myReceipe;
    }
}
