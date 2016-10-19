package com.brushmtsys.templates.spring.rest.controllers;

import com.brushmtsys.templates.spring.rest.model.BeerRecipe;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by justin on 10/19/16.
 */
public class SchemaControllerTest {
    private SchemaController controller;

    @Before
    public void setupTest() {
        controller = new SchemaController();
    }

    /**
     * Test to see if we can get a schema by using only the model object's simple name
     *
     * @throws Exception
     */
    @Test
    public void testGetSimpleName() throws Exception {
        JsonSchema schema = controller.getSchema(BeerRecipe.class.getSimpleName());

        Assert.assertNotNull(schema);
    }

    /**
     * Test to see if we get a SchemaClassNotFound exception for a name
     * that doesn't exist
     */
    @Test
    public void testClassNotFound() throws JsonMappingException {

        try {
            JsonSchema schema = controller.getSchema("BadClassNameNoNoOops");
            Assert.fail("The method should've thrown a SchemaClassNotFoundException");
        } catch (SchemaClassNotFoundException e) {
            // Getting here would be a good thing
        }


    }
}
