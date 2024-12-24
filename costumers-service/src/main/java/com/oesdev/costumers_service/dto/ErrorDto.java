package com.oesdev.costumers_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorDto {

    private String message;
    private int statusCode;
    private String timestamp;

}
