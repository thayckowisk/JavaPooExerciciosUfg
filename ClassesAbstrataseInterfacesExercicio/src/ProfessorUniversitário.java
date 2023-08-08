
public class ProfessorUniversitário extends Professor {

	public ProfessorUniversitário(String nome, int nTurmas, double salário) {
		super(nome, nTurmas, salário);
	}

	@Override
	public Prova[] elaborarProvas() {
		Prova[] provas = new Prova[3];
		
		provas[0] = new Prova(new String[]{ "P1Q1", "P1Q2" });
		provas[1] = new Prova(new String[]{ "P2Q1", "P2Q2" });
		provas[2] = new Prova(new String[]{ "P3Q1", "P3Q2" });
		
		return provas;
	}

}