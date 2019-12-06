package com.gonnect.springapp.controller.exception;

public class RequestDataSetBadRequestException extends RuntimeException{
    public RequestDataSetBadRequestException(final String message) {
        super(message);
    }
}
