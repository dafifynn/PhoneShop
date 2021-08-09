package com.example.phoneshop.service;

import java.util.List;

import com.example.phoneshop.model.Phone;
import com.example.phoneshop.repository.PhoneRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneService {

    @Autowired
    private PhoneRepository phoneRepository;

    public List<Phone> getAllPhones() {
        return phoneRepository.findAll();
    }

    public void createPhone(Phone somePhone) {
        phoneRepository.save(somePhone);
    }
    
}
