package br.com.hustik.curso.exercicio.domain;

import java.io.Serializable;
import java.util.List;

public class MetodoPagamento implements Serializable {

	private static final long serialVersionUID = 1L;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<FormaPagamento> getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(List<FormaPagamento> formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	private String nome;
	private List<FormaPagamento> formaPagamento;

}
