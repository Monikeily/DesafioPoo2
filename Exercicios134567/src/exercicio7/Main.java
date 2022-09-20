package exercicio7;

public class Main {

	public static void main(String[] args) {
		
		Gerente g = new Gerente("Arthur", 40, 1000);
		g.bonificacao();
		System.out.println(g.toString());
		
			
		Supervisor s = new Supervisor("Ricardo", 37, 3000);
		s.bonificacao();
		System.out.println(s.toString());
	
		
		Vendedor v = new Vendedor("Paulo", 28, 2500);
		v.bonificacao();		
		System.out.println(v.toString());

		}

	}
