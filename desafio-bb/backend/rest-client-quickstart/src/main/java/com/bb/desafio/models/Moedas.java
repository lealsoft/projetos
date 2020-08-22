package com.bb.desafio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "TB_MOEDA")
public class Moedas {

    //Símbolo
	@Id
  	@Column(name = "DS_SIMBOLO", nullable = false)
    private String simbolo;

  	//Nome Formatado
	@Column(name = "NO_FORMATADO", nullable = false)
    private String nomeFormatado;
    
	//Tipo Moeda
	@Column(name = "TP_MOEDA", nullable = false)
    private String tipoMoeda;

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getNomeFormatado() {
		return nomeFormatado;
	}

	public void setNomeFormatado(String nomeFormatado) {
		this.nomeFormatado = nomeFormatado;
	}

	public String getTipoMoeda() {
		return tipoMoeda;
	}

	public void setTipoMoeda(String tipoMoeda) {
		this.tipoMoeda = tipoMoeda;
	}
	
}
