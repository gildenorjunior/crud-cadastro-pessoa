package com.example.cadastroPessoas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cadastroPessoas.model.PessoaModel;
import com.example.cadastroPessoas.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoa")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PessoaController {

	@Autowired
	private PessoaRepository repository;

	// MÉTODO GET QUE BUSCA TODAS PESSOAS
	@GetMapping
	public ResponseEntity<List<PessoaModel>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	// MÉTODO POST QUE CRIA UMA PESSOA NOVA
	@PostMapping
	public ResponseEntity<PessoaModel> post(@RequestBody PessoaModel pessoa) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(pessoa));
	}

	// MÉTODO PUT QUE ATUALIZA INFORMAÇÕES DE UMA PESSOA
	@PutMapping
	public ResponseEntity<PessoaModel> put(@RequestBody PessoaModel pessoa) {
		return ResponseEntity.ok(repository.save(pessoa));
	}

	// MÉTODO DELETE QUE APAGA UMA PESSOA BUSCANDO PELO ID
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
