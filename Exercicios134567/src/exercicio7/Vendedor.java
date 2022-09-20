package exercicio7;

	public class Vendedor extends Funcionario {

		public Vendedor(String nome, int idade, double salario) {
			super(nome, idade, salario);
		}
		
		@Override
		public double bonificacao() {
			this.salario += 3000.00;
			return salario;
			
		}
	
	}

	
