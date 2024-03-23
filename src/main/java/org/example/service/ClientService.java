package org.example.service;

import org.example.model.Client;
import org.example.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public void save(Client cLient) {
        clientRepository.save(cLient);
    }

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public Optional<Client> findById(String id){
        return clientRepository.findById(id);
    }
    public void deleteById(String id){
        clientRepository.deleteById(id);
    }
}
