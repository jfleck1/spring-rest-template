package com.brushmtsys.templates.spring.rest.model;

/**
 * An ordered step in a list of instructions for a recipe
 *
 * Created by justin on 10/19/16.
 */
public class RecipeStep {
    private int sequenceNum;
    private String description;

    public int getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(int sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
