package com.dream.jwtlibrary;

import java.util.Date;
import java.util.Map;

/**
 *
 * https://github.com/jwtk/jjwt/blob/master/api/src/main/java/io/jsonwebtoken/Header.java
 *  JWT의 요구(Claim)의 집합
 *
 *  이건은 궁극적으로 JSON map 과 어떤 값이든 더해질 수 있다. 하지만 ,
 */
public interface Claims extends Map<String, Object> ,ClaimMutator<Claims>{
    /** JWT {@code Issuer} claims parameter name: <code>"iss</code>*/
    String ISSUER       = "iss";

    String SUBJECT      = "sub";

    String AUDIENCE     = "aud";

    String EXPIRATION   = "exp";

    String NOT_BEFORE   =" nbp";

    String ISSUED_AT    ="iat";


    String getIssuer();

    @Override
    Claims setIssuer(String iss);

    String getSubject();
    @Override
    Claims setSubject(String sub);

    String getAudience();

    @Override
    Claims setAudience(String aud);

    Date getExpiration();

    @Override
    Claims setExpiration(Date exp);

    Date getNotBefore();

    @Override
    Claims setNotBefore(Date nbf);

    Date getIssuedAt();

    @Override
    Claims setIssueAt(Date iat);

    String getId();

    @Override
    Claims setId(String jti);

    <T> T get (String claimName,Class <T> requireType);
}
