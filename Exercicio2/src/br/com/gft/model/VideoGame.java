package br.com.gft.model;


public class VideoGame extends Produto{
	
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	
	public VideoGame() {
		super();
	}
	
		
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
		
	}
	
	@Override
	public Double calculaImposto() {
		double imposto;

		if (isUsado) {
			imposto = 0.25*super.getPreco();
			System.out.println("Imposto " +  getNome() + " " + modelo + " usado, R$ " + imposto);

		} else {
			imposto = 0.45*super.getPreco();
			System.out.println("Imposto " +  getNome() + " "  + modelo + " R$ " + imposto);
		}

		return imposto;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}


	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	

}