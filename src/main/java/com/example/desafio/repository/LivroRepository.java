package com.example.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.desafio.entity.Livro;


@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
	
}
