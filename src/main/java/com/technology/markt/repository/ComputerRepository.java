package com.technology.markt.repository;

import com.technology.markt.domain.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Integer> {
    Computer getByName(String name);
}
