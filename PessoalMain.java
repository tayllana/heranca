package pessoa;

import pessoa.Pessoa;

public class PessoalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa();
		p.setNome(" ");
		p.setEndere�o(" ");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome(" ");
		pf.setCpf(" ");
		pf.setEndere�o(" ");
		pf.setEstadoCivil(" ");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setCnpj(" ");
		pj.setTipoEmpresa(" ");
		pj.setNome(" ");
		pj.setEndere�o(" ");
	}
	

}
