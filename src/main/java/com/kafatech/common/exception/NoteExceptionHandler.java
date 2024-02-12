package com.kafatech.common.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NoteExceptionHandler {

    @ExceptionHandler({NoteException.class})
    public String runtimeException() {
        return "Note Exception";
    }
}
