package com.technology.markt.service;

import com.technology.markt.domain.MobilePhone;

import java.util.List;

public interface MobilePhoneService {
    void addMobilePhone(MobilePhone mobilePhone);
    MobilePhone getMobilePhoneByName(String name);
    List<MobilePhone> getAllMobilePhones();
    void deleteMobilePhone(MobilePhone id);
}
