package tech.chilo.sa.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import tech.chilo.sa.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findByEmail(String email);
}
