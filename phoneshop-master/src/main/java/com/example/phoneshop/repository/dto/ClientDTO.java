package com.example.phoneshop.repository.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientDTO {

    private String name;

    private String surname;

    private String dni;

    private String adress;

    private String phoneNumber;
    
    private List<BuyOrderDTO> buyOrder;
}
