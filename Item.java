package item;

public class Item {

	private int codigo;
	private String descri�ao;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescri�ao() {
		return descri�ao;
	}
	public void setDescri�ao(String descri�ao) {
		this.descri�ao = descri�ao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n codigo: ");
		builder.append(codigo);
		builder.append("\n descri�ao: ");
		builder.append(descri�ao);
		return builder.toString();
	}
	
	
	
}
