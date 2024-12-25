package com.oesdev.costumers_service.exception;

import com.oesdev.costumers_service.dto.ErrorDto;
import com.oesdev.costumers_service.dto.ErrorValidationDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDto> handleResourceNotFound(ResourceNotFoundException ex) {
        ErrorDto error = new ErrorDto(ex.getMessage(), HttpStatus.NOT_FOUND.value(), LocalDateTime.now().format(DateTimeFormatter.ISO_DATE));
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorValidationDto> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
        HashMap<String, String> errors = new HashMap<>();
        ex.getFieldErrors().forEach(f -> errors.put(f.getField(), f.getDefaultMessage()));
        ErrorValidationDto errorValidation = new ErrorValidationDto(HttpStatus.BAD_REQUEST.value(), errors);
        return new ResponseEntity<>(errorValidation, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CloneException.class)
    public ResponseEntity<ErrorDto> handleClone(CloneException ex) {
        ErrorDto error = new ErrorDto(ex.getMessage(), HttpStatus.BAD_REQUEST.value(), LocalDateTime.now().format(DateTimeFormatter.ISO_DATE));
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
