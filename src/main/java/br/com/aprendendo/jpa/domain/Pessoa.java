package br.com.aprendendo.jpa.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Pessoa {
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, Set<Casa> casas) {
		this();
		this.nome = nome;
		this.casas = casas;
	}

	@Id
	@GeneratedValue
	Long pessoaId;

	@Column(name="NOME")
	String nome;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="pessoaId")
	Set<Casa> casas;

	public Long getPessoaId() {
		return pessoaId;
	}

	public void setPessoaId(Long pessoaId) {
		this.pessoaId = pessoaId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Casa> getCasas() {
		return casas;
	}

	public void setCasas(Set<Casa> casas) {
		this.casas = casas;
	}
	
	
	
	

}
