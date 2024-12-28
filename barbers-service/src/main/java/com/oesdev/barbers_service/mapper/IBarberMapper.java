package com.oesdev.barbers_service.mapper;

import com.oesdev.barbers_service.dto.BarberDto;
import com.oesdev.barbers_service.entity.Barber;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IBarberMapper {

    IBarberMapper mapper = Mappers.getMapper(IBarberMapper.class);

    Barber toEntity(BarberDto barberDto);

    BarberDto toDto(Barber barber);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateBarber(BarberDto barberDto, @MappingTarget Barber barber);

}
