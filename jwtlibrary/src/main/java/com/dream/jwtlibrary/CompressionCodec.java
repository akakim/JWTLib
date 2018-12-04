package com.dream.jwtlibrary;

/**
 *  Compress and decompress byte arrays according to a compression algorithm.
 *
 *  @see CompressionCodecs#DEFLATE
 *  @see CompressionCodecs#GZIP
 *  @since 0.6.0
 *
 */
public interface CompressionCodec {

    /**
     *
     * @return
     */
    String getAlgorithmNames();

    /**
     *
     * @param payload
     * @return
     * @throws CompressionException
     */
    byte[] compres(byte[] payload) throws CompressionException;


    byte[] decompress(byte[] compressed) throws CompressionException;

}
