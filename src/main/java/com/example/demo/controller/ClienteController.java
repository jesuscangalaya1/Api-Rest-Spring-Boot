package com.example.demo.controller;

import com.example.demo.models.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClienteController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    private ResponseEntity<?> listAll() {
        List<Client> clients = clientService.listAll();
        return ResponseEntity.ok(clients);
    }

    @GetMapping("/{idClient}")
    private ResponseEntity<?> listById(@PathVariable Integer idClient) {
        Client client = clientService.listById(idClient);
        return ResponseEntity.ok(client);
    }

    @PostMapping
    private ResponseEntity<?> create(@RequestBody Client client) {
        Client clientCreate = clientService.create(client);
        return ResponseEntity.ok(clientCreate);
    }

    @PutMapping("/{idClient}")
    private ResponseEntity<?> update(@PathVariable Integer idClient, @RequestBody Client client) {
        client.setIdClient(idClient);
        Client clientUpdate = clientService.update(client);
        return ResponseEntity.ok(clientUpdate);
    }

    @DeleteMapping("/{idClient}")
    private ResponseEntity<?> deleteById(@PathVariable Integer idClient) {
        clientService.deleteById(idClient);
        return ResponseEntity.ok(null);
    }


}
