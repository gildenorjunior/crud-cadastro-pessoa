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

import com.example.cadastroPessoas.model.EnderecoModel;
import com.example.cadastroPessoas.repository.EnderecoRepository;

@RestController
@RequestMapping("/endereco")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EnderecoController {

	@Autowired
	private EnderecoRepository repository;

	// MÉTODO GET QUE BUSCA TODOS ENDEREÇOS
	@GetMapping
	public ResponseEntity<List<EnderecoModel>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	// MÉTODO POST QUE CRIA UM ENDEREÇO NOVO
	@PostMapping
	public ResponseEntity<EnderecoModel> post(@RequestBody EnderecoModel endereco) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(endereco));
	}

	// MÉTODO PUT QUE ATUALIZA INFORMAÇÕES DE UM ENDEREÇO
	@PutMapping
	public ResponseEntity<EnderecoModel> put(@RequestBody EnderecoModel endereco) {
		return ResponseEntity.ok(repository.save(endereco));
	}

	// MÉTODO DELETE QUE APAGA UM ENDEREÇO BUSCANDO PELO ID
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
