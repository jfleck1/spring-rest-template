package com.brushmtsys.templates.spring.rest.controllers;

import com.brushmtsys.templates.spring.rest.model.BeerRecipe;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.JsonSchemaGenerator;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by justin on 10/19/16.
 */
@Controller
public class SchemaController {
    @RequestMapping("/schema/{className}")
    @ResponseBody
    JsonSchema getSchema(@PathVariable String className) throws JsonMappingException {
        JsonSchema schema;
        Class<?> clazz;

        // Use the main BeerRecipe class to anchor where the other model classes
        // should be
        String modelPackage = ClassUtils.getPackageName(BeerRecipe.class);
        String classFQN = modelPackage + "." + className;

        try {
            clazz = ClassUtils.resolveClassName(classFQN,
                    SchemaController.class.getClassLoader());
        } catch (IllegalArgumentException e) {
            throw new SchemaClassNotFoundException(classFQN);
        }

        ObjectMapper mapper = new ObjectMapper();
        JsonSchemaGenerator schemaGen = new JsonSchemaGenerator(mapper);
        schema = schemaGen.generateSchema(clazz);

        return schema;
    }
}
