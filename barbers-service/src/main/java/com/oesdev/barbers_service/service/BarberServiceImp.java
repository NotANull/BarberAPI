package com.oesdev.barbers_service.service;

import com.oesdev.barbers_service.dto.BarberDto;
import com.oesdev.barbers_service.entity.Barber;
import com.oesdev.barbers_service.mapper.IBarberMapper;
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

        Barber barber = IBarberMapper.mapper.toEntity(barberDto);

        this.repository.save(barber);

        return "Saved Barber!";
    }

    @Override
    public BarberDto readBarber(Long barber_id) {

        Barber barber = this.repository.findById(barber_id).orElseThrow(() -> new RuntimeException("Barber not found with id " + barber_id));

        return null;
    }

    @Override
    public List<BarberDto> readBarbers() {
        return this.repository.findAll().stream()
                .map(IBarberMapper.mapper::toDto)
                .toList();
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
