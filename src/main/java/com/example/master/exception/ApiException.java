package com.example.master.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

// Lombok, gerekli olan constructor getter setter ve toString metodlarını yapıyor.
// Record classes gives us private final, getter, public constructors, equals, hashcode,
// and toString
@Data
public record ApiException(String message, Throwable throwable, HttpStatus httpStatus, ZonedDateTime zonedDateTime) {
}

