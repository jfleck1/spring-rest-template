package com.brushmtsys.templates.spring.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * An exception thrown when a class is not found to output a schema for. This
 * is mapped to a 404 Not Found HTTP error as well.
 *
 * Created by justin on 10/19/16.
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No Class Found")  // 404
public class SchemaClassNotFoundException extends RuntimeException {
    private String className;

    public SchemaClassNotFoundException(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
