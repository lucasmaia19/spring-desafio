package com.example.desafio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafio.entity.Livro;
import com.example.desafio.repository.LivroRepository;

@RestController
@RequestMapping("api/livro")
public class LivroController {

@Autowired
private LivroRepository livroRepository;

@PostMapping
public Livro cadastrar(@RequestBody Livro livro) {
	return livroRepository.save(livro);

}

@GetMapping
public List<Livro> listatodos() {
	return livroRepository.findAll();

}

@GetMapping ("/{id}") 
public Optional<Livro> findOne(@PathVariable Long id) {
return livroRepository.findById(id);

}

@DeleteMapping ("/{id}") 
public String delete (@PathVariable Long id) {
	livroRepository.deleteById(id);
	return "O Livro com Id: " + id + " Foi deletado com sucesso";
}

@PutMapping ("/{id}") 
public Livro updateLivro(@RequestBody Livro livro, @PathVariable Long id) {
	Livro livroSaved = livroRepository.findById(id).get();
	
	livroSaved.setIsbn(livro.getIsbn()); 
	livroSaved.setNome(livro.getNome());
	livroSaved.setAutor(livro.getAutor());
	livroSaved.setLançamento(livro.getLançamento());
	livroSaved.setFaturamento(livro.getFaturamento());
	
	return livroRepository.save(livroSaved); 

}

}