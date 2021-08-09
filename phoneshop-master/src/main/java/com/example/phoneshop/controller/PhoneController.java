package com.example.phoneshop.controller;

import java.util.List;

import com.example.phoneshop.model.Phone;
import com.example.phoneshop.service.PhoneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @GetMapping(path = "/phone")
    public List<Phone> getPhones() {
        return phoneService.getAllPhones();
    }

    @PostMapping(path = "/phone")
    public void createPhone(@RequestBody Phone somePhone) {
        phoneService.createPhone(somePhone);
    }
}