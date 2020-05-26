package com.example.desafio.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String isbn;
	
	private String nome;
	
	private String autor;
	
	private LocalDate lançamento;
	
	private BigDecimal faturamento; 
	
	
	@ManyToOne
	private Editora editora; 
	
	
//	@JsonIgnoreProperties({"livro"})
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "livro")
//	private List<Editora> editora = new ArrayList<>();
}