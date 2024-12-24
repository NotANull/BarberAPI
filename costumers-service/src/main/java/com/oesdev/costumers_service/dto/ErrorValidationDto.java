package com.oesdev.costumers_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorValidationDto {

    private int statusCode;
    private HashMap<String, String> errors;

}
