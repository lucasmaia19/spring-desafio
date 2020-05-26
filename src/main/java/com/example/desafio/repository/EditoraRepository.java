package com.example.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.desafio.entity.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long> {
	
}
