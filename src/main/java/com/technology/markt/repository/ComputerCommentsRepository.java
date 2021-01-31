package com.technology.markt.repository;

import com.technology.markt.domain.Computer;
import com.technology.markt.domain.ComputerComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerCommentsRepository extends JpaRepository<ComputerComments, Integer> {
}
