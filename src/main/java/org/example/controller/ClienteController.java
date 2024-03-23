package org.example.controller;

import org.example.constant.Constant;
import org.example.model.Client;
import org.example.model.dto.ClientDTO;
import org.example.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClientService clientService;

    @PostMapping(Constant.API_CLIENT)
    public void save (@RequestBody ClientDTO clientDTO){
        clientService.save(new Client(clientDTO));
    }

    @GetMapping(Constant.API_CLIENT)
    public List<Client> findAll(){
        return clientService.findAll();
    }

    @PutMapping(Constant.API_CLIENT)
    public void update(@RequestBody Client client){
        if (client.get_id() == "" || client.get_id() == null){

        }
        clientService.save(client);
    }

    @DeleteMapping(Constant.API_CLIENT + "/{id}")
    public void deleteById(@PathVariable("id") String id){
        clientService.deleteById(id);
    }

    @GetMapping(Constant.API_CLIENT + "/{id}")
    public Optional<Client> findById(@PathVariable String id){
        return clientService.findById(id);
    }
}
