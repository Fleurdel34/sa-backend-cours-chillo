package tech.chilo.sa.service;

import org.springframework.stereotype.Service;
import tech.chilo.sa.entities.Client;
import tech.chilo.sa.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void creer(Client client){
        Client clientDansLaBDD = this.clientRepository.findByEmail(client.getEmail());

        if(clientDansLaBDD == null){
            this.clientRepository.save(client);
        }

    }

    public List<Client> rechercher(){
        return this.clientRepository.findAll();

    }
}
