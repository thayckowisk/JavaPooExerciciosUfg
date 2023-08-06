
public class Compositor {
	
	private String nome;
	private String pais;
	private Musica[] musicas;
	private static int totalCompositores = 0;
	
	public Compositor(String nome, String pais) {
		System.out.println("Criando um objeto Compositor de nome " + nome + " e país " + pais);
		
		
		this.setNome(nome);
		this.setPais(pais);
		
		Compositor.totalCompositores++;
	}
	
	public void listarMusicas() {
		for(Musica musica: musicas) {
			
			System.out.println("Música: " + musica.getTitulo() + ", de " + musica.getCompositor().nome);
		}
	}
	
	public void definirMusicas(String[] titulosDasMusicas) {
	
		System.out.println("O compositor " + nome + " vai criar agora objetos Musica baseando-se numa lista de " + titulosDasMusicas.length + " titulos de musicas");
		
		musicas = new Musica[titulosDasMusicas.length]; 
		for(int i = 0; i < titulosDasMusicas.length; i++) {
			
			musicas[i] = new Musica(titulosDasMusicas[i], this);
		}
	}
	
 String getNome() {
		return nome;
	}

	public String getPais() {
		return pais;
	}
	
	public static int getTotalCompositores() {
		return Compositor.totalCompositores;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
}
