
public class Musica {
	public String titulo;
	public Compositor compositor; 
	
	public Musica(String titulo, Compositor compositor) {
		
		System.out.println("Criando um objeto Musica de título " + titulo + ", do Compositor " + compositor.nome);
		this.titulo = titulo;
		this.compositor = compositor;
	}
	
	public void mostrarCompositor() {
		System.out.println("Compositor: " + compositor.nome);
	}

}

