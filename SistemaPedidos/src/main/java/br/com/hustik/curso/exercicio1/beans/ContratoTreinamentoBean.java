package br.com.hustik.curso.exercicio1.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.hustik.curso.exercicio.domain.Cidade;
import br.com.hustik.curso.exercicio.domain.Curso;
import br.com.hustik.curso.exercicio.domain.FormaPagamento;
import br.com.hustik.curso.exercicio.domain.MetodoPagamento;
import br.com.hustik.curso.exercicio.domain.Modalidade;

@ManagedBean
@ViewScoped
public class ContratoTreinamentoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String razaoSocial;
	private String cnpj;
	private Cidade cidade;
	private Modalidade modalidade;
	private Date dataContratacao;
	private Double valor;
	private MetodoPagamento metodoPagamento;
	private FormaPagamento formaPagamento;
	private List<Curso> cursosContratados;

	public void salvar() {
		System.out.println("batata");
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Cadastro realizado com sucesso!", null));
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public MetodoPagamento getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public List<Curso> getCursosContratados() {
		return cursosContratados;
	}

	public void setCursosContratados(List<Curso> cursosContratados) {
		this.cursosContratados = cursosContratados;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
}