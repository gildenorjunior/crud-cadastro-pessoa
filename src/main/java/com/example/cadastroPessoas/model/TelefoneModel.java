package com.example.cadastroPessoas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_telefone")
public class TelefoneModel {

	//ATRIBUTOS
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idTelefone;
	
	private String codigoPais;
	private String ddd;
	private String numero;
	private String tipoTelefone;
	
	//RELACIONAMENTO VÁRIOS TELEFONES PARA UMA PESSOA
	@ManyToOne
	@JsonIgnoreProperties("telefone")
	private PessoaModel pessoa;
	
	//MÉTODOS GETTERS E SETTERS
	public String getCodigoPais() {
		return codigoPais;
	}
	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	public PessoaModel getPessoa() {
		return pessoa;
	}
	public void setPessoa(PessoaModel pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
}
