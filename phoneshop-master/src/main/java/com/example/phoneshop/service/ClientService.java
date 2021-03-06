package com.example.phoneshop.service;

import java.util.List;

import com.example.phoneshop.model.Client;
import com.example.phoneshop.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client getClient(Long id) {
        return clientRepository.getById(id);
    }


    public void createClient(Client someClient) {
        clientRepository.save(someClient);
    }

    public void deleteClient(Client someClient){
        clientRepository.delete(someClient);
    }
    
}
