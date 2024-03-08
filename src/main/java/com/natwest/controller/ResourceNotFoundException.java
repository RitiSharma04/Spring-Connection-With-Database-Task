package com.natwest.controller;

public class ResourceNotFoundException extends Exception{
    public ResourceNotFoundException(String s) {
        super(s);
    }
}
