package com.technology.markt.service;

import com.technology.markt.domain.MobilePhone;

import java.util.List;

public interface MobilePhoneService {
    void addMobilePhone(MobilePhone mobilePhone);
    public MobilePhone getMobilePhoneByName(String name);
    public List<MobilePhone> getAllMobilePhones();
    public void deleteMobilePhone(MobilePhone id);
}
