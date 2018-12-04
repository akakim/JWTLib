package com.dream.jwtlibrary;

/**
 *
 * https://github.com/jwtk/jjwt/blob/master/api/src/main/java/io/jsonwebtoken/Header.java
 * 이 클리스는 {@link JwtException}의 하위클래스이다.
 * 그것은
 *
 * @since 0.5
 */
public class ClaimJwtException extends JwtException {

    public static final String INCORRECT_EXPECTED_CLAIM_MESSAGE_TEMPLAGE
            = " %s 로 예상되는 요청(Claim)은 다음 %s와 같을 것이다. 하지만 다음과 같은 요청(Claim) : %s 이 입력되었습니다.";
    public static final String MISSING_EXPECTED_CLAIM_MESSAGE_TEMPLATE = "Expected %s claim to be: %s, but was not present in the JWT claims.";

    private final Header header;
    private final Claims claims;


    public ClaimJwtException(Header header, Claims claims,String message) {
        super(message);
        this.header = header;
        this.claims = claims;

    }

    public ClaimJwtException(Header header, Claims claims,String message,Throwable cause) {
        super(message, cause);

        this.header = header;
        this.claims = claims;
    }

    public Header getHeader() {
        return header;
    }

    public Claims getClaims() {
        return claims;
    }
}
