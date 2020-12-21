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

import com.example.cadastroPessoas.model.TelefoneModel;
import com.example.cadastroPessoas.repository.TelefoneRepository;

@RestController
@RequestMapping("/telefone")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TelefoneController {

	@Autowired
	private TelefoneRepository repository;

	// MÉTODO GET QUE BUSCA TODOS TELEFONES
	@GetMapping
	public ResponseEntity<List<TelefoneModel>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	// MÉTODO POST QUE CRIA UM TELEFONE NOVO
	@PostMapping
	public ResponseEntity<TelefoneModel> post(@RequestBody TelefoneModel telefone) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(telefone));
	}

	// MÉTODO PUT QUE ATUALIZA INFORMAÇÕES DE UM TELEFONE
	@PutMapping
	public ResponseEntity<TelefoneModel> put(@RequestBody TelefoneModel telefone) {
		return ResponseEntity.ok(repository.save(telefone));
	}

	// MÉTODO DELETE QUE APAGA UM TELEFONE BUSCANDO PELO ID
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
