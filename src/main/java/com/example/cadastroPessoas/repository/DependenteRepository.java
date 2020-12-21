package com.example.cadastroPessoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cadastroPessoas.model.DependenteModel;

public interface DependenteRepository extends JpaRepository<DependenteModel, Long> {

}
