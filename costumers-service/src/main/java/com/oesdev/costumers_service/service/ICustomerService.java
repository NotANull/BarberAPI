package com.oesdev.costumers_service.service;

import com.oesdev.costumers_service.dto.CustomerDto;

import java.util.List;

public interface ICustomerService {

    public String createCostumer(CustomerDto customerDto);

    public CustomerDto readCostumer(Long id);

    public List<CustomerDto> readCostumers();

    public String updateCostumer(Long id, CustomerDto customerDto);

    public String deleteCostumer(Long id);

}
