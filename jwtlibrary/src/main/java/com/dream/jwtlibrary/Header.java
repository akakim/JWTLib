package com.dream.jwtlibrary;

import java.util.Map;


/**
 *
 * JWT는 기본적으로 Header, Payload , signature 로 나뉘어진다.
 * 그 중 header와 관련된 인터페이스이다.
 * 이것은 궁극적으로 JSON 맵이다. 그리고 어떤 값이든 JSON맵에 더해질 것이다. 하지만 JWT JOSE 표준 이름들은
 * 편의를 위한 getter ,setter 들은 종류별 안전(type-safe) 하게 제공될 것이다.
 * @param <T>
 *
 * @since 0.1
 *
 * reference : https://github.com/jwtk/jjwt/blob/master/api/src/main/java/io/jsonwebtoken/Header.java
 */
public interface Header<T extends Header<T>> extends Map<String,Object> {

    /** JWT {@code Type} (type) value: <code>"JWT"</code>*/
    String JWT_TYPE = "JWT";

    /** JWT {@code Type} header parameter name : <code>"typ"</code>*/
    String TYPE = "typ";

    /** JWT {@code Compression Algorithm} header parameter nameL <code>"zip"</code> */
    String CONTENT_TYPE = "cty";

    /** JJWT legacy/deprecated compression algorithm header parameter name: <code>"calg"</code>
     * @deprecated use {@link #COMPRESSION_ALGORITHM} instead. */
    String COMPRESSION_ALGORITHM = "zip";


    /** Returns the <a href="https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-25#section-5.1
     *  <code>typ</code> (type) header value or {@code null} if not present
     *
     *  @return the {@code typ} header value or {@code null}if not present
     */
    String getType();

    /**
     *
     */
    T setType (String typ);

    /**
     * Returns the <a href="https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-25#section-5.2">
     * <code>cty</code></a> (Content Type) header value or {@code null} if not present.
     *
     * <p>In the normal case where nested signing or encryption operations are not employed
     *
     * </p>
     * @return the {@code typ} header parameter value of {@code null} if not present
     */
    String getContentType();


    /**
     *
     * @return
     */
    String getCompressionAlgorithm();

    /**
     * Sets the JWT <code>zip</code> (Compression Algorithm) header parameter value. A {@code null} value will remove
     * the property from the JSON map.
     * <p></p>
     *
     * @param zip
     * @return
     */

    T setCompressionAlgorithm(String zip);
}
