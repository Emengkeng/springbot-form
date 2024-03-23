package com.juslen.form.controller;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.net.BindException;

@ControllerAdvice
public class HandleExceptionHandler {
    @ExceptionHandler
    public  String bindException(final MethodArgumentNotValidException methodArgumentNotValidException){
        return "redirect:error.html";

    }
}
