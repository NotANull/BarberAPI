package com.oesdev.costumers_service.repository;

import com.oesdev.costumers_service.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT COUNT(c) > 0 FROM Customer c WHERE c.dni =:dni")
    boolean existsByDni(@Param("dni") String dni);

}
