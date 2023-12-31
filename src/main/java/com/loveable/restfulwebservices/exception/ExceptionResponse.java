package com.loveable.restfulwebservices.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private String details;
}
