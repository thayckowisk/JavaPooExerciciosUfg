
public class Principal {

	public static void main(String[] args) {
		
		ProfessorUniversitário maria = new ProfessorUniversitário("Maria", 2, 3000);
		ProfessorDeEducaçãoBásica josé = new ProfessorDeEducaçãoBásica("José", 3, 2000);
		Aluno joão = new Aluno("João", 12345);
	
		Estudante[] pessoasQueEstudam = new Estudante[3];
		pessoasQueEstudam[0] = maria;
		pessoasQueEstudam[1] = josé;
		pessoasQueEstudam[2] = joão;
		
		for (Estudante estudante: pessoasQueEstudam) 
			estudante.estudar();
		
		
		Prova[] provasDaFaculdade = maria.elaborarProvas();
		
		joão.fazerProva(provasDaFaculdade[0]);
		maria.corrigirProva(provasDaFaculdade[0]);
	
		System.out.println("João tirou "+ provasDaFaculdade[0].getNota() + " na prova.");

	}
}

