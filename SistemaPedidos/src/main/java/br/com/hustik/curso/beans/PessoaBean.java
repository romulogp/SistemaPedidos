package br.com.hustik.curso.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class PessoaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String telefone;
	private String telefoneComercial;
	private String matricula;

	public void atualizar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
		System.out.println("Telefone Comercial: " + this.telefoneComercial);
		System.out.println("Matricula: " + this.matricula);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario atualizado com sucesso!"));
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
