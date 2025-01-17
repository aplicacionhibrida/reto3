package com.usa.controller;

import com.usa.entities.Client;
import com.usa.service.ClientService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Client")
@CrossOrigin(origins = "*", 
             methods = {RequestMethod.GET,
                        RequestMethod.POST,
                        RequestMethod.PUT,
                        RequestMethod.DELETE})
public class ClientController {

    @Autowired
    private ClientService clientService;
    
    
     @GetMapping("/all")
    public List<Client> getMotos() {
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Client> getMoto(@PathVariable("id") int clientId) {
        return clientService.getClient(clientId);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client client){
        return clientService.save(client);
    }
}
