/**
 * Thayckowisk Correia Campos
 * O uso da classe Scanner em qualquer código Java constitui uma relação de dependência deste projeto com esta classe.
 * Nos diagramas de classe UML, a relação de composição é representada por uma linha sólida terminada em um losango preenchido.
 * Nos diagramas de classe UML, a relação de agregação é representada por uma linha sólida terminada em um losango aberto.
 * A composição é um tipo de associação que pode ser lida como "parte de um todo".
 * A especialização é o inverso da generalização, processo onde se determina atributos e métodos em comum entre classes para definição de uma superclasse.
 */
public class Compositor {
	public String nome;
	public String pais;
	public Musica[] musicas; 
	
	public Compositor(String nome, String pais) {
		System.out.println("Criando um objeto Compositor de nome " + nome + " e país " + pais);
		
		this.nome = nome;
		this.pais = pais;
	}
	public void listarMusicas() {
		for(Musica musica: musicas) {
			System.out.println("Música: " + musica.titulo + ", de " + musica.compositor.nome);
		}
	}
	public void definirMusicas(String[] nomesDasMusicas) {
		System.out.println("O compositor " + nome + " vai criar agora objetos Musica baseando-se numa lista de " + nomesDasMusicas.length + " titulos de musicas");
		
		musicas = new Musica[nomesDasMusicas.length]; 
		for(int i = 0; i < nomesDasMusicas.length; i++) {
			
			musicas[i] = new Musica(nomesDasMusicas[i], this);
		}
	}
}
