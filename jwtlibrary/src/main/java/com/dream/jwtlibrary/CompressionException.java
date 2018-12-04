package com.dream.jwtlibrary;

public class CompressionException extends JwtException {

    public CompressionException(String message) {
        super(message);
    }

    public CompressionException(String message, Throwable cause) {
        super(message, cause);
    }
}
