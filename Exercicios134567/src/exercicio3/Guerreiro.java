package exercicio3;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{

	private List<String> habilidade;
	private static int contDeGuerreiros = 0;
	
	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> habilidade) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.habilidade = habilidade;
		contDeGuerreiros++;
	}
	
	@Override
	public void lvlUp() {
		setVida(getVida() + 1);
		setForca(getForca() + 1);
		
	}

	public void attack() {
				
		Random rand = new Random();
		int randomNum = rand.nextInt(300) + 0;
		int atqGuerreiro = (getForca()*getLevel()) + randomNum;
		System.out.println("Ataque do Guerreiro: "+atqGuerreiro);
	}
	
	public void aprenderHabilidade() {
		
	}

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}

	public static int getContDeGuerreiros() {
		return contDeGuerreiros;
	}

	public static void setContDeGuerreiros(int contDeGuerreiros) {
		Guerreiro.contDeGuerreiros = contDeGuerreiros;
	}

	
	
	
}
