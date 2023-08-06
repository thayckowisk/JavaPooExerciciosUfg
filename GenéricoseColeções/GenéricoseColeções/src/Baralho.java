
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Baralho extends LinkedList<Carta> {
	private String tema;

	public Baralho(String tema) {
		this.setTema(tema);
	}


	public void carregar() {
		
		switch(tema) {
			case "Dinossauros":
				this.add(new Carta("Tiranossauro", "A1"));
				this.add(new Carta("Apatossauros", "A2"));
				this.add(new Carta("Diplodocus", "A3"));
				this.add(new Carta("Velociraptor", "A4"));
				this.add(new Carta("Triceraptor", "B1"));
				this.add(new Carta("Estegossauros", "B2"));
				this.add(new Carta("Brachiossauro", "B3"));
				this.add(new Carta("Compsagonatos", "B4"));
			break;
			case "Carros":
				this.add(new Carta("Ferrari", "A1"));
				this.add(new Carta("Porsche", "A2"));
				this.add(new Carta("Corolla", "A3"));
				this.add(new Carta("Onix", "A4"));
				this.add(new Carta("HB20", "B1"));
				this.add(new Carta("Sandero", "B2"));
				this.add(new Carta("Celta", "B3"));
				this.add(new Carta("Uno", "B4"));
			break;
		}
	}
	
	public void embaralhar() {
		Collections.shuffle(this);
	}
	
	
	public void distribuir(Jogador[] jogadores) {
		int jogador = 0; 
		
		Iterator<Carta> iterador = this.iterator();
		
	
		while ( iterador.hasNext() ) {
			
			if (jogadores[jogador].getMonte() == null)
				jogadores[jogador].setMonte( new Baralho(this.tema) );
			
			
			jogadores[jogador].getMonte().add(iterador.next());
			iterador.remove();

			jogador = (jogador + 1) % jogadores.length;  
		}
	}
	
	public Carta pegarDoTopo() {
		if ( this.peekLast() != null )
			return this.pollLast();
		
		System.out.println("O monte não tem mais cartas!");
		return null;
	}
	

	public void listarCartas() {
		System.out.println(this);
	}
	

	public String getTema() {
		return tema;
	}


	private void setTema(String tema) {
		this.tema = tema;
	}
	
}
