package br.com.hustik.curso.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class InversaoNomeBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String nomeInvertido;
	private int quantidadePalavras;

	public void inverter() {
		this.nomeInvertido = "";
		this.quantidadePalavras = 0;

		if (this.nome != null && !this.nome.isEmpty()) {
			quantidadePalavras = 1;
		}
		
		for (int i = this.nome.length() - 1; i >= 0; i--) {
			char letra = this.nome.charAt(i);
			this.nomeInvertido += letra;

			if (letra == ' ') {
				quantidadePalavras++;
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeInvertido() {
		return nomeInvertido;
	}

	public void setNomeInvertido(String nomeInvertido) {
		this.nomeInvertido = nomeInvertido;
	}

	public int getQuantidadePalavras() {
		return quantidadePalavras;
	}

	public void setQuantidadePalavras(int quantidadePalavras) {
		this.quantidadePalavras = quantidadePalavras;
	}

}