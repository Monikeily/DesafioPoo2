package exercicio1;

public class Main {

	public static void main(String[] args) {
		
		Veiculo carro1 = new Veiculo("Chevrolet", "Vectra", "NIN1111", "Prata", 10, 25, 32.000f);
		
		System.out.println(carro1.toString());
		
		System.out.println();
		
		carro1.acelerar();
		carro1.ligar();
		System.out.println("Carro ligado com velocidade: "+ carro1.getVelocidade());
		carro1.acelerar();
		System.out.println("Acelerando com velocidade: "+ carro1.getVelocidade());
		carro1.abastecer(25);
		System.out.println("Tanque com: " + carro1.getLitrosCombustivel() + " litros ");
		carro1.abastecer(50);
		System.out.println("Seu tanque está com: " + carro1.getLitrosCombustivel() + " litros ");
		carro1.frear();
		System.out.println("Freio, velocidade: "+carro1.getVelocidade());
		carro1.frear();
		System.out.println("Velocidade: "+carro1.getVelocidade());
		carro1.ligar();
		System.out.println("Velocidade: "+carro1.getVelocidade());
		carro1.acelerar();
		System.out.println("Carro em movimento com velocidade: "+carro1.getVelocidade());
		carro1.frear();
		System.out.println("Freio, velocidade: "+carro1.getVelocidade());
		carro1.pintar("Amarelo");
		carro1.desligar();
		carro1.desligar();
		carro1.ligar();
		System.out.println("Carro ligado com velocidade: "+ carro1.getVelocidade());
		carro1.acelerar();
		System.out.println("Acelerando com velocidade: "+ carro1.getVelocidade());
		carro1.desligar();
		
	}

}
