package com.example.cadastroPessoas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_pessoa")
public class PessoaModel {

	//ATRIBUTOS
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idPessoa;
	
	private String nome;
	private String apelido;
	private String cpf;
	private String profissao;
	private double salario;
	private String aniversario;
	
	//RELACIONAMENTO UMA PESSOA PODE TER VÁRIOS ENDEREÇOS
	@OneToMany (mappedBy = "pessoa", cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"dependente", "telefone", "endereco"})
	private  List<EnderecoModel> endereco;
	
	//RELACIONAMENTO UMA PESSOA PODE TER VÁRIOS DEPENDENTES
	@OneToMany (mappedBy = "pessoa", cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"endereco", "telefone", "dependente"})
	private  List<DependenteModel> dependente;
	
	//RELACIONAMENTO UMA PESSOA PODE TER VÁRIOS TELEFONES
	@OneToMany (mappedBy = "pessoa", cascade = CascadeType.ALL)
	@JsonIgnoreProperties({"dependente", "telefone", "endereco"})
	private  List<TelefoneModel> telefone;
	
	
	//MÉTODOS GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getAniversario() {
		return aniversario;
	}
	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	public List<EnderecoModel> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<EnderecoModel> endereco) {
		this.endereco = endereco;
	}
	public List<DependenteModel> getDependente() {
		return dependente;
	}
	public void setDependente(List<DependenteModel> dependente) {
		this.dependente = dependente;
	}
	public List<TelefoneModel> getTelefone() {
		return telefone;
	}
	public void setTelefone(List<TelefoneModel> telefone) {
		this.telefone = telefone;
	}
	
	
}
