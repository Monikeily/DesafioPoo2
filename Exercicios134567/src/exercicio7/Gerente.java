package exercicio7;

	public class Gerente extends Funcionario {
		
		public Gerente(String nome, int idade, double salario) {
			super(nome, idade, salario);
		}
		
		@Override
		public double bonificacao() {
			this.salario += 10000.00;
			return salario;
		}
		
}