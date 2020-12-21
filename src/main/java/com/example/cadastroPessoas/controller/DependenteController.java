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

import com.example.cadastroPessoas.model.DependenteModel;
import com.example.cadastroPessoas.repository.DependenteRepository;

@RestController
@RequestMapping("/dependente")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DependenteController {

	@Autowired
	private DependenteRepository repository;

	// MÉTODO GET QUE BUSCA TODOS DEPENDENTES
	@GetMapping
	public ResponseEntity<List<DependenteModel>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	// MÉTODO POST QUE CRIA UM DEPENDENTE NOVO
	@PostMapping
	public ResponseEntity<DependenteModel> post(@RequestBody DependenteModel dependente) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(dependente));
	}

	// MÉTODO PUT QUE ATUALIZA INFORMAÇÕES DE UM DEPENDENTE
	@PutMapping
	public ResponseEntity<DependenteModel> put(@RequestBody DependenteModel dependente) {
		return ResponseEntity.ok(repository.save(dependente));
	}

	// MÉTODO DELETE QUE APAGA UM DEPENDENTE BUSCANDO PELO ID
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
