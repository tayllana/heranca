package item;

public class Item {

	private int codigo;
	private String descriçao;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescriçao() {
		return descriçao;
	}
	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n codigo: ");
		builder.append(codigo);
		builder.append("\n descriçao: ");
		builder.append(descriçao);
		return builder.toString();
	}
	
	
	
}
