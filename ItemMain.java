package item;

public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i = new Item();
		i.setCodigo(0);
		i.setDescriçao(" ");
		System.out.println(i);
		
		Livro l = new Livro();
		l.setAutor(" ");
		System.out.println(l);
		
		Midia m = new Midia();
		m.setGravadora(" ");
		m.setDuraçao(0);
		System.out.println(m);
		
		VHS v = new VHS();
		v.setTitulo(" ");
		System.out.println(v);
		
		CD c = new CD();
		c.setAlbum(" ");
		c.setArtista(" ");
		c.setFaixa(0);
		System.out.println(c);
	}

}
