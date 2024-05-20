package com.denghv.lakesidehotel.exception;

/**
 * @author Simpson Alfred
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
