package com.oesdev.costumers_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDto {

    private Long customer_id;
    private String name;
    private String lastname;
    private String telephone;

}
