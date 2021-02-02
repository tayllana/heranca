package item;

public class CD extends Midia {
	private int faixa;
	private String album;
	private String artista;
	public int getFaixa() {
		return faixa;
	}
	public void setFaixa(int faixa) {
		this.faixa = faixa;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CD [faixa=");
		builder.append(faixa);
		builder.append(", album=");
		builder.append(album);
		builder.append(", artista=");
		builder.append(artista);
		return builder.toString();
	}
	
	
}
