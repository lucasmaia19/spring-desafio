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

import com.example.desafio.entity.Cidades;
import com.example.desafio.repository.CidadesRepository;

@RestController
@RequestMapping("api/cidades")
public class CidadesController {

@Autowired
private CidadesRepository cidadesRepository;

@PostMapping
public Cidades cadastrar(@RequestBody Cidades cidades) {
	return cidadesRepository.save(cidades);

}

@GetMapping
public List<Cidades> listatodos() {
	return cidadesRepository.findAll();

}

@GetMapping ("/{id}") 
public Optional<Cidades> findOne(@PathVariable Long id) {
return cidadesRepository.findById(id);

}

@DeleteMapping ("/{id}") 
public String delete (@PathVariable Long id) {
	cidadesRepository.deleteById(id);
	return "A cidade com Id: " + id + " Foi deletado com sucesso";
}

@PutMapping ("/{id}") 
public Cidades updateCidades(@RequestBody Cidades cidades, @PathVariable Long id) {
	Cidades cidadesSaved = cidadesRepository.findById(id).get();
	
	cidadesSaved.setNome(cidades.getNome());
	cidadesSaved.setEstado(cidades.getEstado());
	
	return cidadesRepository.save(cidadesSaved); 

}

}