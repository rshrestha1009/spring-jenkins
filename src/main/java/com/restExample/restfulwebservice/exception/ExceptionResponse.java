package com.restExample.restfulwebservice.exception;

import java.time.LocalDateTime;
import java.util.Date;

public class ExceptionResponse {
    private Date timestamp;
    private String Message;
    private String details;

    public ExceptionResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        Message = message;
        this.details = details;
    }
}
