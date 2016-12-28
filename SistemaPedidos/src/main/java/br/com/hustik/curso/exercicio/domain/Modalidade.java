package br.com.hustik.curso.exercicio.domain;

public enum Modalidade {

	EAD("EAD"), PRESENCIAL("Presencial");

	private Modalidade(String descricao) {
		this.descricao = descricao;
	}

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

}
