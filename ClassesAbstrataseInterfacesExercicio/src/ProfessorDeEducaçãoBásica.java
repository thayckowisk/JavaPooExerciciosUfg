public class ProfessorDeEducaçãoBásica extends Professor {

	public ProfessorDeEducaçãoBásica(String nome, int nTurmas, double salário) {
		super(nome, nTurmas, salário);
	}

	@Override
	public Prova[] elaborarProvas() {
		Prova[] provas = new Prova[4];
		
		provas[0] = new Prova(new String[]{ "P1Q1", "P1Q2", "P1Q3", "P1Q4", "P1Q5" });
		provas[1] = new Prova(new String[]{ "P2Q1", "P2Q2", "P2Q3", "P2Q4", "P2Q5" });
		provas[2] = new Prova(new String[]{ "P3Q1", "P3Q2", "P3Q3", "P3Q4", "P3Q5" });
		provas[3] = new Prova(new String[]{ "P4Q1", "P4Q2", "P4Q3", "P4Q4", "P4Q5" });
		
		return provas;
	}

}
