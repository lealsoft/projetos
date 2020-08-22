package com.bb.desafio.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TB_COTACAO")
public class Cotacao {
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_COTACAO")
    @SequenceGenerator(name = "SEQ_COTACAO", sequenceName = "SEQ_COTACAO", allocationSize = 1)
    @NotNull
    @Column(name = "ID")
    private Long id;
    
    //TimeStamp da Requisição
	@Column(name = "TS_REQUISICAO", nullable = false)
    private Long tsRequisicao;
    
    @Column(name = "DT_DATA_COTACAO_DOLAR", nullable = false)
    private LocalDate dtCotacaoDolar;
    
    @Column(name = "VR_COTACAO_COMPRA")
    private BigDecimal cotacaoCompra;
    
    @Column(name = "VR_COTACAO_VENDA")
    private BigDecimal cotacaoVenda;
    
    @Column(name = "DT_DATAHORA_COTACAO_DOLAR", nullable = false)
    private LocalDateTime dataHoraCotacao;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getTsRequisicao() {
		return tsRequisicao;
	}

	public void setTsRequisicao(Long tsRequisicao) {
		this.tsRequisicao = tsRequisicao;
	}

	public LocalDate getDtCotacaoDolar() {
		return dtCotacaoDolar;
	}

	public void setDtCotacaoDolar(LocalDate dtCotacaoDolar) {
		this.dtCotacaoDolar = dtCotacaoDolar;
	}

	public BigDecimal getCotacaoCompra() {
		return cotacaoCompra;
	}

	public void setCotacaoCompra(BigDecimal cotacaoCompra) {
		this.cotacaoCompra = cotacaoCompra;
	}

	public BigDecimal getCotacaoVenda() {
		return cotacaoVenda;
	}

	public void setCotacaoVenda(BigDecimal cotacaoVenda) {
		this.cotacaoVenda = cotacaoVenda;
	}

	public LocalDateTime getDataHoraCotacao() {
		return dataHoraCotacao;
	}

	public void setDataHoraCotacao(LocalDateTime dataHoraCotacao) {
		this.dataHoraCotacao = dataHoraCotacao;
	}

}