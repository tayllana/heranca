package item;

public class Midia extends Item {

	private String gravadora;
	private float dura�ao;
	
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public float getDura�ao() {
		return dura�ao;
	}
	public void setDura�ao(float dura�ao) {
		this.dura�ao = dura�ao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Midia");
		builder.append("\n gravadora: ");
		builder.append(gravadora);
		builder.append("\n dura�ao: ");
		builder.append(dura�ao);
		return builder.toString();
	}
	
	
}
