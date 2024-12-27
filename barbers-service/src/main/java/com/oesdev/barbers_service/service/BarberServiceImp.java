package com.oesdev.barbers_service.service;

import com.oesdev.barbers_service.dto.BarberDto;
import com.oesdev.barbers_service.repository.IBarberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarberServiceImp implements IBarberService{

    private final IBarberRepository repository;

    public BarberServiceImp(IBarberRepository repository) {
        this.repository = repository;
    }

    @Override
    public String createBarber(BarberDto barberDto) {
        return "";
    }

    @Override
    public BarberDto readBarber(Long barber_id) {
        return null;
    }

    @Override
    public List<BarberDto> readBarbers() {
        return List.of();
    }

    @Override
    public String updateBarber(BarberDto barberDto, Long barber_id) {
        return "";
    }

    @Override
    public String deleteBarber(Long barber_id) {
        return "";
    }
}
