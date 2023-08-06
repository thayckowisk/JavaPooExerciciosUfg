// THAYCKOWISK CORREIA CAMPOS - matricula - 202201668
//Exercício 1

//1.1) A palavra-chave final especiﬁca que uma variável não é modiﬁcável.
//1.2) O modiﬁcador de acesso padrão (default, package) em um atributo indica que ele está visível para todas as classes e objetos do mesmo pacote.
//1.3) O modiﬁcador de acesso public em um atributo indica que ele está visível para todas
//as classes e objetos do projeto, mesmo fora do pacote.
//1.4) Um atributo static, tem seu valor compartilhado entre todos os objetos da classe, sendo também chamado de Variável de Classe.
//1.5) Deﬁnir um método público getter (de acesso) para um atributo privado é uma maneira de
//encapsular a informação, garantindo que seu acesso seja controlado pelo desenvolvedor
//da classe

public class Musica {
	private String titulo;
	private Compositor compositor; 
	
	public Musica(String titulo, Compositor compositor) {
		
		System.out.println("\tCriando um objeto Musica de título " + titulo + ", do Compositor " + compositor.getNome());
		
		this.setTitulo(titulo); 
		this.setCompositor(compositor);
	}

	public void mostrarCompositor() {
		System.out.println("Compositor: " + compositor.getNome());
	}


	public String getTitulo() {
		return titulo;
	}
	
	public Compositor getCompositor() {
		return compositor;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setCompositor(Compositor compositor) {
		this.compositor = compositor;
	}

}
