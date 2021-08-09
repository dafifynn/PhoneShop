package com.example.phoneshop.repository.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BuyOrderDTO {

    private ClientDTO client;

    private List<PhoneDTO> phones;

    private Float payAmount;
}