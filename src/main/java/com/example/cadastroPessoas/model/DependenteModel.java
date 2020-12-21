package com.example.cadastroPessoas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_dependente")
public class DependenteModel {

	//ATRIBUTOS
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idDependente;
	
	private String nomeDependente;
	private String tipoDependente;
	
	//RELACIONAMENTO VÁRIOS DEPENDENTES PARA UMA PESSOA
	@ManyToOne
	@JsonIgnoreProperties("dependente")
	private PessoaModel pessoa;
	
	
	//MÉTODOS GETTERS E SETTERS
	public String getNomeDependente() {
		return nomeDependente;
	}
	public void setNomeDependente(String nomeDependente) {
		this.nomeDependente = nomeDependente;
	}
	public String getTipoDependente() {
		return tipoDependente;
	}
	public void setTipoDependente(String tipoDependente) {
		this.tipoDependente = tipoDependente;
	}
	public PessoaModel getPessoa() {
		return pessoa;
	}
	public void setPessoa(PessoaModel pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
}
