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
public class GeografiaMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<String> estados = new ArrayList<>();
	private List<String> cidades = new ArrayList<>();

	private String nome;
	private String cidade;
	private String estado;

	public GeografiaMB() {
		estados.add("SC");
		estados.add("SP");
		estados.add("RS");
	}

	public void carregarCidades() {
		cidades.clear();
		if ("SC".equals(estado)) {
			cidades.add("Balneário Camboriú");
			cidades.add("Itajaí");
			cidades.add("Camboriú");
		} else if ("SP".equals(estado)) {
			cidades.add("São Paulo");
			cidades.add("Franca");
			cidades.add("Ribeirão Preto");
		} else if ("RS".equals(estado)) {
			cidades.add("Passo Fundo");
			cidades.add("Ijuí");
		}
	}
	
	public void atualizar() {
		System.out.println("Estado: " + this.estado);
		System.out.println("Cidade: " + this.cidade);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public List<String> getEstados() {
		return estados;
	}

	public void setEstados(List<String> estados) {
		this.estados = estados;
	}

	public List<String> getCidades() {
		return cidades;
	}

	public void setCidades(List<String> cidades) {
		this.cidades = cidades;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
