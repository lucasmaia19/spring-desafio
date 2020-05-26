package com.example.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.desafio.entity.Cidades;

@Repository
public interface CidadesRepository extends JpaRepository<Cidades, Long> {
}

