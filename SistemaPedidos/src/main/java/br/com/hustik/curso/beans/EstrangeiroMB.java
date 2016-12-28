package br.com.hustik.curso.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class EstrangeiroMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String paisOrigem;
	private List<String> paises = new ArrayList<>();
	
	public EstrangeiroMB() {
		paises.add("Alemanha");
		paises.add("Argentina");
		paises.add("Brasil");
		paises.add("Bélgica");
		paises.add("Estados Unidos");
	}
	
	public void atualizar() {
		System.out.println("Nome Imigrante: " + nome);
		System.out.println("País de Origem: " + paisOrigem);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Exibindo resultado no console..."));
	}
	
	public List<String> sugerirPaises(String query) {
		System.out.println("Query: " + query);
		List<String> paisesSugeridos = new ArrayList<>();
		for (String pais: paises) {
			if (pais.toLowerCase().startsWith(query.toLowerCase())) {
				paisesSugeridos.add(pais);
			}
		}
		return paisesSugeridos;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

}
