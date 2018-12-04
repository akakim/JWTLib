package com.dream.jwtlibrary;

import java.util.Date;

/**
 * a clock represents a time source that can be used when creating and verifying JWTs;
 */
public interface Clock {

    Date now();
}
