package com.oesdev.costumers_service.service;

import com.oesdev.costumers_service.dto.CustomerDto;
import com.oesdev.costumers_service.entity.Customer;
import com.oesdev.costumers_service.exception.CloneException;
import com.oesdev.costumers_service.exception.ResourceNotFoundException;
import com.oesdev.costumers_service.mapper.ICustomerMapper;
import com.oesdev.costumers_service.repository.ICustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements ICustomerService {

    private final ICustomerRepository repository;

    public CustomerServiceImp(ICustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public String createCostumer(CustomerDto customerDto) {

        if (this.repository.existsByDni(customerDto.getDni())) {
            throw new CloneException("Client with DNI " + customerDto.getDni() + " has already been created");
        }

        Customer costumer = ICustomerMapper.mapper.toEntity(customerDto);

        this.repository.save(costumer);

        return "Saved Customer!";
    }

    @Override
    public CustomerDto readCostumer(Long id) {

        Customer costumer = this.repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Costumer not found with id " + id));

        return ICustomerMapper.mapper.toDto(costumer);
    }

    @Override
    public List<CustomerDto> readCostumers() {
        return this.repository.findAll().stream()
                .map(ICustomerMapper.mapper::toDto)
                .toList();
    }

    @Override
    public String updateCostumer(Long id, CustomerDto customerDto) {

        Customer costumer = this.repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Costumer not found with id " + id));

        ICustomerMapper.mapper.updateCustomer(customerDto, costumer);

        this.repository.save(costumer);

        return "Updated Customer!";
    }

    @Override
    public String deleteCostumer(Long id) {

        Customer costumer = this.repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Costumer not found with id " + id));

        this.repository.delete(costumer);

        return "Deleted Customer";
    }
}