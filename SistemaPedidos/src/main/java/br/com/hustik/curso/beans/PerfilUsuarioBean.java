package br.com.hustik.curso.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class PerfilUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final List<Interesse> INTERESSES = new ArrayList<>();
	
	// Bloco executado quando a classe é carregada
	static {
		INTERESSES.add(new Interesse("Cinema", "cinema"));
		INTERESSES.add(new Interesse("Computação", "computacao"));
		INTERESSES.add(new Interesse("Esportes", "esportes"));
		INTERESSES.add(new Interesse("Leitura", "leitura"));
	}
	
	private String nome;
	private String profissao;
	private Date dataNascimento;
	private Interesse interesse;
	private List<String> interessesCheckBox;
	
	public void atualizar() {
		System.out.println("Data Nascimento: " + this.dataNascimento);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}
	
	public void exibirInteressesCheckbox() {
		for (String interesse : interessesCheckBox) {
			System.out.println(interesse);
		}
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Exibindo itens selecionados no console..."));
	}

	public List<String> getInteressesCheckbox() {
		return interessesCheckBox;
	}
	
	public void setInteressesCheckbox(List<String> interesses) {
		this.interessesCheckBox = interesses;
	}
	
	public List<Interesse> getInteresses() {
		return INTERESSES;
	}

	public Date getDataHoje() {
		return new Date();
	}
	
	// Getters & Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Interesse getInteresse() {
		return interesse;
	}

	public void setInteresse(Interesse interesse) {
		this.interesse = interesse;
	}

}
