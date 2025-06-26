package tech.chilo.sa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.chilo.sa.entities.Sentiment;

public interface SentimentRepository extends JpaRepository<Sentiment, Integer> {
}
