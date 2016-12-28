package br.com.hustik.curso.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class PessoaMB {

	private String nome;
	private String estadoCivil;
	private String sexo;

	public void atualizar() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
				" Nome: " + this.nome +
				" Sexo: " + this.sexo + 
				" Estado Civil: " + this.estadoCivil));
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
