package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public abstract class Produto implements Imposto {
	
	private String nome;
	private Double preco;
	private int qtd;

	public Produto() {
		super();
	}
	
	public Produto(String nome, Double preco, int qtd) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	@Override
	public Double calculaImposto() {
		return 0.0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	

}