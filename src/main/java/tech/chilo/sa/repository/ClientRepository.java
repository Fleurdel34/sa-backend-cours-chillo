package tech.chilo.sa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.chilo.sa.entities.Client;


public interface ClientRepository extends JpaRepository<Client, Integer> {
}
