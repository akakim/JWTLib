package com.dream.jwtlibrary;

import java.util.Date;

/**
 * mutation (modification ) to a {@link com.dream.jwtlibrary.Claims Claims} instance
 * @param <T>
 */

public interface ClaimMutator <T extends ClaimMutator> {

    T setIssuer (String iss);

    T setSubject (String sub);

    T setAudience (String aud);

    T setExpiration(Date exp);

    T setNotBefore(Date nbf);

    T setIssueAt(Date iat);

    T setId(String jti);
}
