package br.com.aprendendo.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Casa {
	
	@Id
	@GeneratedValue
	private Long casaId;
	
	@Column(name="NOME_DA_CASA")
	private String nomeDaCasa;

	public Casa() {
		super();
	}

	public Casa(String nomeDaCasa) {
		this();
		this.nomeDaCasa = nomeDaCasa;
	}

	public Long getCasaId() {
		return casaId;
	}

	public void setCasaId(Long casaId) {
		this.casaId = casaId;
	}

	public String getNomeDaCasa() {
		return nomeDaCasa;
	}

	public void setNomeDaCasa(String nomeDaCasa) {
		this.nomeDaCasa = nomeDaCasa;
	}
	
	

}
