package item;

public class Livro extends Item {

	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Livro");
		builder.append("\n Autor: ");
		builder.append(autor);
		return builder.toString();
	}
	
	
}
