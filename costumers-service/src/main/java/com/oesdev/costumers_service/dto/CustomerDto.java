package com.oesdev.costumers_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDto {

    private Long customer_id;
    @Size(min = 2, max = 20, message = "Name must be longer than 2 characters and less than 20")
    @NotBlank(message = "Name can't be blank")
    private String name;
    private String lastname;
    private String telephone;

}
