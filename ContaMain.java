package simples;

public class ContaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new Conta();
		c.setAgencia(0);
		c.setBanco("");
		c.setNumeroConta(0);
		c.setSaldo(0);
		System.out.println(c);
		
		ContaSimples s = new ContaSimples();
		s.setAgencia(0);
		s.setBanco("");
		s.setNumeroConta(0);
		s.setSaldo(0);
		s.setSaldoPolpança(0);
		System.out.println(s);
		
		ContaEspecial e = new ContaEspecial();
		e.setDiaSemJuros(0);
		e.setLimite(0);
		e.setAgencia(0);
		e.setBanco("");
		e.setNumeroConta(0);
		e.setSaldo(0);
		System.out.println(e);
		

	}

}
