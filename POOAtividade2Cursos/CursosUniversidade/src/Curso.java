
public class Curso {
	String nome;
	char periodo = 'm'; // 'm', 'v', 'n'
	int totalAlunos;
	boolean ehPosGraduacao = false;
	
	// Constructor
	public Curso (
		String nome,
		char periodo,
		int totalAlunos,
		boolean ehPosGraduacao
	) {
		this.nome = nome;
		this.periodo = periodo;
		this.totalAlunos = totalAlunos;
		this.ehPosGraduacao = ehPosGraduacao;
	}
	
	public String obterPeriodo() {
		switch(this.periodo) {
			case 'v':
			return "Vespertino";
			case 'n':
			return "Noturno";
			case 'm':
			default:
			return "Matutino";
		}
	}
}
