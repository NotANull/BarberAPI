package com.oesdev.barbers_service.repository;

import com.oesdev.barbers_service.entity.Barber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBarberRepository extends JpaRepository<Barber, Long> {
}
