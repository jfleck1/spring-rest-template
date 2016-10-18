package com.brushmtsys.templates.spring.rest.model;

import java.util.Date;

/**
 * Created by justin on 10/18/16.
 */
public class BeerRecipe {
    private String name;
    private Date createdOn;
    private BeerStyle style;
    private double specificGravity;
    private double abv;
    private long ibu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public BeerStyle getStyle() {
        return style;
    }

    public void setStyle(BeerStyle style) {
        this.style = style;
    }

    public double getSpecificGravity() {
        return specificGravity;
    }

    public void setSpecificGravity(double specificGravity) {
        this.specificGravity = specificGravity;
    }

    public double getAbv() {
        return abv;
    }

    public void setAbv(double abv) {
        this.abv = abv;
    }

    public long getIbu() {
        return ibu;
    }

    public void setIbu(long ibu) {
        this.ibu = ibu;
    }
}
