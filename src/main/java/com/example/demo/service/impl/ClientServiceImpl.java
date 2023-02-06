package com.example.demo.service.impl;

import com.example.demo.models.Client;
import com.example.demo.repository.ClientRespository;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRespository clientRespository;


    @Override
    public List<Client> listAll() {
        return clientRespository.findAll();
    }

    @Override
    public Client listById(int idClient) {
        return clientRespository.findById(idClient).get();
    }

    @Override
    public Client create(Client client) {
        return clientRespository.save(client);
    }

    @Override
    public Client update(Client client) {
        return clientRespository.save(client);
    }

    @Override
    public void deleteById(int idClient) {
        clientRespository.deleteById(idClient);
    }
}
