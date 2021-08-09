package com.example.phoneshop.repository.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PhoneDTO {
    
    private String brand;

    private String model;

    private Float price;

    private String code;

    private BuyOrderDTO buyOrder;
}
