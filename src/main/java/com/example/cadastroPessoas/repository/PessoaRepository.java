package com.example.cadastroPessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cadastroPessoas.model.PessoaModel;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long>{

}
