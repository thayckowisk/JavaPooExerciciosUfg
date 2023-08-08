
public abstract class Professor implements FuncionárioAssalariado, Estudante {
	private String nome;
	private int nTurmas;
	private double salário;
	
	public Professor(String nome, int nTurmas, double salário) {
		this.nome = nome;
		this.nTurmas = nTurmas;
		this.salário = salário;
	}
	
	
	public abstract Prova[] elaborarProvas();
	
	public double corrigirProva(Prova prova) {
		String[] respostas = prova.getRespostas();
		double nota = 0;
		
		for (int i = 0; i < respostas.length; i++) {
			if ( respostas[i].contentEquals("R" + (i + 1)) )
				nota += 10/respostas.length;
		}
		prova.setNota(nota);
		
		return prova.getNota();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getnTurmas() {
		return nTurmas;
	}
	
	public void setnTurmas(int nTurmas) {
		this.nTurmas = nTurmas;
	}
	
	public double getSalário() {
		return salário;
	}
	
	private void setSalário(double salário) {
		this.salário = salário;
	} 

	@Override
	public void estudar() {
		System.out.println("Professor também estuda!");
	}

	@Override
	public void receberSalário(int nTurmas) {
		this.setSalário(salário + (nTurmas * salário * 0.05));
	}
}
