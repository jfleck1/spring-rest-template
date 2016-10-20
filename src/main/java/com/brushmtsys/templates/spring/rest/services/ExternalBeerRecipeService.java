package com.brushmtsys.templates.spring.rest.services;

import com.brushmtsys.templates.spring.rest.model.ExternalBeerRecipe;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * This service consumes an external API
 * and returns the response body
 *
 * Created by ealexhaywood on 10/20/16.
 */

@Service
public class ExternalBeerRecipeService {

    public List<ExternalBeerRecipe> read() {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<ExternalBeerRecipe>> recipeResponse =
                        restTemplate.exchange("http://api.malt.io/v1/public/recipes?detail=true",
                                                HttpMethod.GET,
                                                null,
                                                new ParameterizedTypeReference<List<ExternalBeerRecipe>>(){});

        return recipeResponse.getBody();
    }

}
