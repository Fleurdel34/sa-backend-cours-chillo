package tech.chilo.sa.service;

import org.springframework.stereotype.Service;
import tech.chilo.sa.entities.Client;
import tech.chilo.sa.entities.Sentiment;
import tech.chilo.sa.repository.SentimentRepository;

import java.util.List;

@Service
public class SentimentService {

    private ClientService clientService;
    private SentimentRepository sentimentRepository;

    public SentimentService(ClientService clientService, SentimentRepository sentimentRepository) {
        this.clientService = clientService;
        this.sentimentRepository = sentimentRepository;
    }

    public void creer(Sentiment sentiment){

        Client client = this.clientService.lireOuCreer(sentiment.getClient());
        sentiment.setClient(client);
        this.sentimentRepository.save(sentiment);

    }

    public List<Sentiment> rechercher() {
        return this.sentimentRepository.findAll();
    }

    public void supprimer(int id) {
        this.sentimentRepository
    }
}
