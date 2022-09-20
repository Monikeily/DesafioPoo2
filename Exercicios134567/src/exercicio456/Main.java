package exercicio456;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("João", 15);
		Pessoa pessoa1 = new Pessoa("Leandro", 21);
		Pessoa pessoa2 = new Pessoa("Paulo", 17);
		Pessoa pessoa3 = new Pessoa("Jessica", 18);
		
		List<Pessoa> listaPessoas = new ArrayList<>();
		
		listaPessoas.add(pessoa);
		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);
		listaPessoas.add(pessoa3);
		
		
		System.out.println("EXERCICIO 4");
		System.out.println();
		System.out.println("PESSOAS");
		
		for (int i = 0; i < listaPessoas.size(); i++) {
		
	    System.out.println(listaPessoas.get(i).getNome() + " | " + 
							listaPessoas.get(i).getIdade());
		}
		// Exercicio 4 - Pessoa mais velha.
		
		System.out.println();
		System.out.println("PESSOA MAIS VELHA");
		Pessoa pessoaMaisVelha = Collections.max(listaPessoas);
		
		System.out.println(pessoaMaisVelha.getNome() + " | " + 
				pessoaMaisVelha.getIdade());
		System.out.println();
		System.out.println("xxxxxxxxxxxxxxxxxx xxxxxxxxxxxxxxxxxxxx");
		
		// Exercicio 5 - Exclusão de menores de 18 anos.
		System.out.println("EXERCICIO 5");
		System.out.println("Total de pessoas na lista: "+listaPessoas.size());
		System.out.println("Removendo menores de 18 anos na lista ");  
		listaPessoas.removeIf( listapessoas -> listapessoas.getIdade() < 18);
		System.out.println("Quantidade atual na lista: "+listaPessoas.size());  
		
		
		// Exercicio 6 - Procurando por nome Jessica na lista
		System.out.println();
		System.out.println("xxxxxxxxxxxxxxxxxx xxxxxxxxxxxxxxxxxxxx");
		System.out.println("EXERCICIO 6");
		System.out.println("Procurando pelo o nome de Jessica na lista ");
		Pessoa achar = listaPessoas.stream().filter(pess ->"Jessica".equals(pess.getNome())).findAny().orElse(null);
		System.out.println(achar);
				
		}
	}

	

