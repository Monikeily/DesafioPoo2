package br.com.gft.model;


public class Livro extends Produto {
	
	private String autor;
	private String tema;
	private int qtdPag;
	
	public Livro() {
		super();
	}

	public Livro(String nome, Double preco, int qnt, String autor, String tema, int qtdPag) {
		super(nome, preco, qnt);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	@Override
	public Double calculaImposto() {

		if (tema == "educativo") {
			System.out.println("Livro educativo não tem imposto: "+super.getNome() + ".");
			return 0.0;
		} else {
			double imposto =  0.1 * super.getPreco();
			System.out.println("R$ "+imposto+" de impostos sobre o livro "+super.getNome() + ".");
			return imposto;
		}
		
	}

	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTema() {
		return tema;
	}


	public void setTema(String tema) {
		this.tema = tema;
		
	}

	public int getQtdPag() {
		return qtdPag;
	}


	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}


	
}
	


