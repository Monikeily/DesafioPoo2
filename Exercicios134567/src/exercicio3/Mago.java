package exercicio3;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem{
	
	
	private List<String> magia;
	private static int contDeMagos = 0;
	
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magia) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.magia = magia;
		contDeMagos++; 
	}
	
	@Override
	public void lvlUp() {
		setMana(getMana() + 1);
		setInteligencia(getInteligencia() + 1);
				
	}		
	
	public void attack() {
		
		Random ran = new Random();
		int randomNum = ran.nextInt(300) + 0;
		int ataqueMago = (getInteligencia()*getLevel()) + randomNum;
		System.out.println("Ataque do Mago: "+ataqueMago);
	
	}
	
	public List<String> getMagia() {
		return magia;
	}

	public void setMagia(List<String> magia) {
		this.magia = magia;
	}

	public static int getContDeMagos() {
		return contDeMagos;
	}

	public static void setContDeMagos(int contDeMagos) {
		Mago.contDeMagos = contDeMagos;
	}

	public void aprenderMagia(String magia) {
		
	}

	
	
	
}
