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

import com.example.desafio.entity.Editora;
import com.example.desafio.repository.EditoraRepository;

@RestController
@RequestMapping("api/editora")
public class EditoraController {

@Autowired
private EditoraRepository editoraRepository;

@PostMapping
public Editora cadastrar(@RequestBody Editora editora) {
	return editoraRepository.save(editora);

}

@GetMapping
public List<Editora> listatodos() {
	return editoraRepository.findAll();

}

@GetMapping ("/{id}") 
public Optional<Editora> findOne(@PathVariable Long id) {
return editoraRepository.findById(id);

}

@DeleteMapping ("/{id}") 
public String delete (@PathVariable Long id) {
	editoraRepository.deleteById(id);
	return "A produtora com Id: " + id + " Foi deletado com sucesso";
}

@PutMapping ("/{id}") 
public Editora updateEditora(@RequestBody Editora editora, @PathVariable Long id) {
	Editora editoraSaved = editoraRepository.findById(id).get();
	
	editoraSaved.setNome(editora.getNome());
	
	return editoraRepository.save(editoraSaved); 

}

}