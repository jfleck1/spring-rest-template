package com.brushmtsys.templates.spring.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

/**
 * Just created as a test to match
 * the schema of the consumed API at
 * http://api.malt.io/v1/public/recipes?detail=true
 *
 * Created by ealexhaywood on 10/20/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalBeerRecipe {

    // External beer recipe attributes
    private Date created;
    private String slug;
    private String id;
    private String parent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

}
