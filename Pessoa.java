package pessoa;

public class Pessoa{
	private String nome;
	private String endere�o;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("PESSOA");
		builder.append("\n nome: ");
		builder.append(nome);
		builder.append("\n endere�o: ");
		builder.append(endere�o);
		return builder.toString();
	}
	
}
