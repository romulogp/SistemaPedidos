package br.com.hustik.curso.exercicio.domain;

import java.io.Serializable;

public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String descricao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
