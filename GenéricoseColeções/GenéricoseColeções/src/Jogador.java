
public class Jogador {
	private String nome;
	private Baralho monte;
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Baralho getMonte() {
		return monte;
	}
	public void setMonte(Baralho monte) {
		this.monte = monte;
	}
	
}