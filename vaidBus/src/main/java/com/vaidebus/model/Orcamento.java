package com.vaidebus.model;

public class Orcamento {
	private String nome;
	private String email;
	private String cpf;
	private String telefone;
	private String cidade;
	private String pacotes;
	private String pessoa;
	private double qtPessoa;
	private double valorPessoa;
	private double result;
	private String mensagem;
	
	

	public Orcamento(String nome, String email, String telefone, String cidade, String pacotes, String pessoa,
			double qtPessoa, double valorPessoa, double result) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cidade = cidade;
		this.pacotes = pacotes;
		this.pessoa = pessoa;
		this.qtPessoa = qtPessoa;
		this.valorPessoa = valorPessoa;
		this.result = result;
	}


	public Orcamento() {
	}
	public String getCpf() {
		return cpf;
	}
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getPacotes() {
		return pacotes;
	}

	public void setPacotes(String pacotes) {
		this.pacotes = pacotes;
	}

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	public double getQtPessoa() {
		return qtPessoa;
	}

	public void setQtPessoa(double qtPessoa) {
		this.qtPessoa = qtPessoa;
	}

	public double getValorPessoa() {
		return valorPessoa;
	}

	public void setValorPessoa(double valorPessoa) {
		this.valorPessoa = valorPessoa;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public String getMensagem() {
		return mensagem;
	}


	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	public double calcular() {
		return this.result = this.valorPessoa * this.qtPessoa;
	}
}
