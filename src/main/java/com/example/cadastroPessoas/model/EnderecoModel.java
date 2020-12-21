package com.example.cadastroPessoas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_endereco")
public class EnderecoModel {

	//ATRIBUTOS
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idEndereco;
	
	private String tipoEndereco;
	private String tipo;
	private String nome;
	private int numero;
	private String complemento;
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	
	//RELACIONAMENTO VÁRIOS ENDEREÇOS PARA UMA PESSOA
	@ManyToOne
	@JsonIgnoreProperties("endereco")
	private PessoaModel pessoa;
	
	//MÉTODOS GETTERS E SETTERS
	public String getTipoEndereco() {
		return tipoEndereco;
	}
	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public PessoaModel getPessoa() {
		return pessoa;
	}
	public void setPessoa(PessoaModel pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
}
