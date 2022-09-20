package exercicio3;


public class Main {

	public static void main(String[] args) {
		
		Personagem personagem1 = new Mago("Marvel", 12000, 48, 65f, 120, 38, 18, null);
		Mago mago1 = new Mago("Bruxo", 12001, 56, 92f, 121, 50, 76, null);
		Personagem personagem2 = new Guerreiro("Principe", 45000, 6, 89f, 90, 150, 19, null);
		Guerreiro guerreiro1 = new Guerreiro("Lutador", 60005, 8, 110f, 89, 110, 19, null);
		
		System.out.println(personagem1);
		System.out.println(mago1);
		System.out.println(personagem2);
		System.out.println(guerreiro1);
		
		System.out.println(" xxxxx ATRIBUTOS xxxxx  ");
		personagem1.lvlUp();
		mago1.lvlUp();
		personagem2.lvlUp();
		guerreiro1.lvlUp();
	
		System.out.println(personagem1);
		System.out.println(mago1);
		System.out.println(personagem2);
		System.out.println(guerreiro1);
		
		
		System.out.println(" xxxxx ATAQUES xxxxx ");
		mago1.attack();
		guerreiro1.attack();
		
		System.out.println(" xxxxx SOMANDO xxxxx ");
		
		System.out.println("Quantidade de magos: "+Mago.getContDeMagos());
		System.out.println("Quantidade de guerreiros: "+Guerreiro.getContDeGuerreiros());
		
		
	}
}
