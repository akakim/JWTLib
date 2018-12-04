package com.dream.jwtlibrary;


/**
 * JWT와 관계된 실행시간의 예외를 위한 기본 클래스
 */
public class JwtException extends RuntimeException {

    public JwtException(String message){
        super(message);
    }


    public JwtException(String message, Throwable cause) {
        super(message, cause);
    }
}
