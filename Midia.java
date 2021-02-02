package item;

public class Midia extends Item {

	private String gravadora;
	private float duraçao;
	
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public float getDuraçao() {
		return duraçao;
	}
	public void setDuraçao(float duraçao) {
		this.duraçao = duraçao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Midia");
		builder.append("\n gravadora: ");
		builder.append(gravadora);
		builder.append("\n duraçao: ");
		builder.append(duraçao);
		return builder.toString();
	}
	
	
}
