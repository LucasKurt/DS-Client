package com.lucasprojects.dsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasprojects.dsclient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
