package com.algaworks.algafood.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Embeddable
public class Endereco {

	@Column(name = "enderero_cep")
	private String cep;
	
	@Column(name = "enderero_logradouro")
	private String logradouro;
	
	@Column(name = "enderero_numero")
	private String numero;
	
	@Column(name = "enderero_complemento")
	private String complemento;
	
	@Column(name = "enderero_bairro")
	private String bairro;
	
	@ManyToOne
	@JoinColumn(name = "endereco_cidade_id")
	private Cidade cidade;
	
}
