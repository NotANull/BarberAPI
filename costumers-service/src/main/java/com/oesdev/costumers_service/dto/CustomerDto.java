package com.oesdev.costumers_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.internal.IgnoreForbiddenApisErrors;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDto {

    private Long customer_id;

    @Size(min = 2, max = 20, message = "Name must be between 2 and 20 characters")
    @NotBlank(message = "Name can't be empty")
    private String name;

    @Size(min = 2, max = 30, message = "Lastname must be between 2 and 30 characters")
    @NotBlank(message = "Lastname can't be empty")
    private String lastname;

    @Size(min = 7, max = 15, message = "Phone number must be between 7 and 15 characters")
    @NotBlank(message = "Phone number can't be empty")
    @Pattern(regexp = "^\\+?[0-9 .()-]{7,15}$", message = "Phone number is not in a valid format")
    private String phoneNumber;

    @Size(min = 7, max = 8, message = "DNI must be between 7 and 8 characters")
    @NotBlank(message = "DNI can't be empty")
    @Pattern(regexp = "\\d{7,8}", message = "DNI must contain only numbers")
    private String dni;

}
