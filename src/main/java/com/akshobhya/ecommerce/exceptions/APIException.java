package com.akshobhya.ecommerce.exceptions;

public class APIException extends RuntimeException {

    public APIException(String message) {
        super(message);
    }

    public APIException() {
    }

    private static final long serialVersionUID = 1L;

}
