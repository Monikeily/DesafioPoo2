package exercicio456;

public class Pessoa implements Comparable<Pessoa>{

	 private String nome;
	 private int idade;
	 
	 public Pessoa(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}

	@Override
	public int compareTo(Pessoa pPessoa) {
		return (this.idade - pPessoa.getIdade());
	}

	@Override
	public String toString() {
		return "Encontrada: " + nome + ", Idade = " + idade + " ";
	}
	 
	 
}
