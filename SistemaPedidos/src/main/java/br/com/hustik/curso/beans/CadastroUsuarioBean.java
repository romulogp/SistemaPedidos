package br.com.hustik.curso.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String login;
	private String senha;
	
	public void cadastrar() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Login: " + this.login);
		System.out.println("Senha: " + this.senha);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro efetuado com sucesso!"));
	}
	
	public void verificarDisponibilidadeLogin() {
		FacesMessage msg = null;
		System.out.println("Verificando disponibilidade: " + this.login);
		
		if ("hustik".equalsIgnoreCase(this.login)) {
			msg = new FacesMessage("Login já está em uso.");
			msg.setSeverity(FacesMessage.SEVERITY_WARN);
		} else {
			msg = new FacesMessage("Login disponível.");
		}
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
