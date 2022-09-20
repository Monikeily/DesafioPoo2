package exercicio1;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;
	
	public Veiculo(String marca, String modelo, String placa, 
			String cor,	float km, int litrosCombustivel, double preco) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.placa = placa;
			this.cor = cor;
			this.km = km;
			this.isLigado = false;
			this.litrosCombustivel = litrosCombustivel;
			this.velocidade = 0;
			this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "xxxxx Veiculo xxxxx\nMarca = " + marca + 
				"\nModelo = " + modelo + "\nPlaca = " + placa + 
				"\nCor = " + cor + "\nKm = " + km + 
				"\nLitros Combustivel = " + litrosCombustivel + 
				"\nPreco = " + preco + " ";
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
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		this.km = km;
	}
	public boolean getisLigado() {
		return isLigado;
	}
	public void setisLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void acelerar() {
		if (this.isLigado == true) {
			this.velocidade +=20;
		} else {
				System.out.println("Precisa ligar o carro antes de acelerar");
		}
	}
	
	public void abastecer (int combustivel) {
		combustivel += this.litrosCombustivel;
		if (combustivel >= 0 && combustivel <= 60) {
			litrosCombustivel = combustivel;
		} else {
			System.out.println("A Capacidade do Tanque é de 60 litros.");
		}
	}
			
	public void frear () {
		if (this.velocidade == 0 || this.isLigado==false) {
		System.out.println("O Carro está desligado ou está parado.");
		}  else {
		this.velocidade -= 20;
		}
	}
	
	public void pintar (String cor) {
		this.cor = cor;
		System.out.println("Veiculo pintado de: " + this.getCor());
	}
	
	public void ligar () {
		if(this.isLigado==true) {
			System.out.println("O carro já está ligado");
		} else {
			this.isLigado=true;
		}
	} 	
	
	public void desligar () {
		if(this.isLigado == false) {
			System.out.println("O carro já está desligado");
					}
		else if(this.isLigado == true && this.velocidade > 0) {
			System.out.println("Pare o carro antes de desligar");
		} else {
			this.isLigado = false;
			System.out.println("Carro desligado.");
		}
	}
		}

