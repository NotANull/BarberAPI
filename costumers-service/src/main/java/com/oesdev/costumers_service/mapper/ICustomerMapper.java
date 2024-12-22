package com.oesdev.costumers_service.mapper;

import com.oesdev.costumers_service.dto.CustomerDto;
import com.oesdev.costumers_service.entity.Customer;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ICustomerMapper {

    ICustomerMapper mapper = Mappers.getMapper(ICustomerMapper.class);

    Customer toEntity(CustomerDto customerDto);

    CustomerDto toDto(Customer costumer);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateCustomer(CustomerDto customerDto, @MappingTarget Customer costumer);

}
