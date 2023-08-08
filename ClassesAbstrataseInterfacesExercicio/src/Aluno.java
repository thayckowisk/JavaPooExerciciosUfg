public class Aluno implements Estudante {
	private String nome;
	private int nMatrícula;
	
	public Aluno(String nome, int nMatrícula) {
		this.nome = nome;
		this.nMatrícula = nMatrícula;
	}
	
	public void fazerProva(Prova prova) {
		String[] respostas = new String[prova.getQuestões().length];
		for (int i = 0; i < respostas.length; i++)
			respostas[i] = "R" + (i + 1);
		
		prova.setRespostas(respostas);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getnMatrícula() {
		return nMatrícula;
	}
	
	public void setnMatrícula(int nMatrícula) {
		this.nMatrícula = nMatrícula;
	}

	@Override
	public void estudar() {
		System.out.println("Oh vida, quanto estudo!");
	}

}
