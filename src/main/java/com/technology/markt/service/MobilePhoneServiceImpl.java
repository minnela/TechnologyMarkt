package com.technology.markt.service;

import com.technology.markt.domain.MobilePhone;
import com.technology.markt.repository.MobilePhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobilePhoneServiceImpl implements MobilePhoneService {

    MobilePhoneRepository mobilePhoneRepository;

    @Autowired
    public MobilePhoneServiceImpl(MobilePhoneRepository mobilePhoneRepository) {
        this.mobilePhoneRepository = mobilePhoneRepository;
    }

    @Override
    public void addMobilePhone(MobilePhone mobilePhone) {
        mobilePhoneRepository.save(mobilePhone);
    }

    @Override
    public MobilePhone getMobilePhoneByName(String name) {
        return mobilePhoneRepository.getByName(name);
    }

    @Override
    public List<MobilePhone> getAllMobilePhones() {
        return mobilePhoneRepository.findAll();
    }

    @Override
    public void deleteMobilePhone(MobilePhone mobilePhone) {
        mobilePhoneRepository.delete(mobilePhone);
    }
}
