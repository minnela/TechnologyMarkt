package com.technology.markt.repository;

import com.technology.markt.domain.MobilePhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobilePhoneRepository extends JpaRepository<MobilePhone, Integer> {
    MobilePhone getByName(String name);
}
