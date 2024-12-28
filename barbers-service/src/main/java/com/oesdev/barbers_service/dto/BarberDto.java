package com.oesdev.barbers_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BarberDto {

    @Size(min = 2, max = 20, message = "Name must be between 2 and 20 characters")
    @NotBlank(message = "Name can't be empty")
    private String name;

}
