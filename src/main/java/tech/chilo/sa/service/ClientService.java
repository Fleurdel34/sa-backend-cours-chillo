package tech.chilo.sa.service;

import org.springframework.stereotype.Service;
import tech.chilo.sa.entities.Client;
import tech.chilo.sa.repository.ClientRepository;

@Service
public class ClientService {

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    private ClientRepository clientRepository;

    public void creer(Client client){
        this.clientRepository.save(client);
    }
}
