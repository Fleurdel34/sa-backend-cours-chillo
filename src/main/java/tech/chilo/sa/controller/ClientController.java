package tech.chilo.sa.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tech.chilo.sa.entities.Client;
import tech.chilo.sa.service.ClientService;

import java.util.List;

import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path ="client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @ResponseStatus(value= HttpStatus.CREATED)
    @PostMapping( consumes = APPLICATION_JSON_VALUE)
    public void creer(@RequestBody Client client){
        this.clientService.creer(client);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Client> rechercher(){
        return this.clientService.rechercher();
    }

    @GetMapping(path="{id}",produces = APPLICATION_JSON_VALUE)
    public Client lire(@PathVariable int id){
        return this.clientService.lire(id);
    }

    @ResponseStatus(NO_CONTENT)
    @PutMapping(path="{id}", consumes = APPLICATION_JSON_VALUE)
    public void modifier (@PathVariable int id, @RequestBody Client client){
        this.clientService.modifier(id, client);
    }
}
