package exercicio7;

	public class Supervisor extends Funcionario {

		public Supervisor(String nome, int idade, double salario) {
			super(nome, idade, salario);
		}
				
		@Override
		public double bonificacao() {
			this.salario += 5000.00;
			return salario;
		}
				
	}

	
	
	

