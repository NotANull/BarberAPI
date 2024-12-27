package com.oesdev.barbers_service.service;

import com.oesdev.barbers_service.dto.BarberDto;

import java.util.List;

public interface IBarberService {

    String createBarber(BarberDto barberDto);

    BarberDto readBarber(Long barber_id);

    List<BarberDto> readBarbers();

    String updateBarber(BarberDto barberDto, Long barber_id);

    String deleteBarber(Long barber_id);

}
