package pessoa;

public class Pessoa{
	private String nome;
	private String enderešo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;		
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("PESSOA");
		builder.append("\n nome: ");
		builder.append(nome);
		builder.append("\n enderešo: ");
		builder.append(enderešo);
		return builder.toString();
	}
	
}
