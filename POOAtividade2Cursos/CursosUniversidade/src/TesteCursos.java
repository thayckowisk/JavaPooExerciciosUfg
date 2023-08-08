
import java.util.Scanner; 

public class TesteCursos {

	public static void main(String[] main ) {
		Curso[] cursos = new Curso[4]; 
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		char periodo;
		int totalAlunos;
		boolean ehPosGraduacao;
		
		for (int i = 0; i < cursos.length; i++) {
			System.out.print("Entre com o nome do curso: ");
			nome = scanner.nextLine(); 
			System.out.print("O período do curso " + nome + " é Matutino (m), Vespertino (v) ou Noturno (n)? ");
			periodo = scanner.next().charAt(0);
			System.out.print("Qual o total de alunos do curso " + nome + "? ");
			totalAlunos = scanner.nextInt(); 
			System.out.print("Este é um curso de pós graduação? Responda true para Sim, false para Não: ");
			ehPosGraduacao = scanner.nextBoolean(); 
			scanner.nextLine();
			cursos[i] = new Curso(nome, periodo, totalAlunos, ehPosGraduacao);
			System.out.println("------------------");
		}
		
		
		System.out.println("Cursos cadastrados: ");
		for (Curso umCurso: cursos) {
			System.out.print(umCurso.nome);
			System.out.println(umCurso.ehPosGraduacao ? " (Pós-graduação)" : " (Graduação)");
			System.out.println("Total de " + umCurso.totalAlunos + " alunos.");
			System.out.println("Período " + umCurso.obterPeriodo());
			System.out.println("------------------");
		}
		
		scanner.close();
	}
}
/**
 * - Bom dia prof, isso foi o que eu consegui fazer durante a aula, a gente veio de uma prof não muito boa com programação 1, no geral a gente aprendeu a entender o q código significa e não a fazer, e a parte lógica ficou meio defasada, tipo a gente sabe o que o comando for por exemplo básico faz, mas não como e onde a gente implementa esse for, tô dando esse fedback pq pelo menos pra mim conceitos como varrer matrizes e esses loops em java estão meio dificies de construir sem a consulta de algo na internet, pq em c seguia uma linha cronologica e em java é mais complexo e acredito que com o tempo a gente vá pegando... mas ainda acho que pra muita gente da turma tmb tenha algo assim relacionado, e não que seja culpa da prof, mas acho que nós nos acomodamos por ela ser meio liberal pq as avaliação eram em forma de projetos que podiam ser feitos em casa com a ajuda da internet, achei melhor falar agora que tá no começo pq pelo visto ninguém da turma quer admitir acho que estão com vergonha, enfim não sei se o sr vai ler mas tá ai, não consegui nem fazer esse código pronto rodar entrou em loop..
public String nome;
	public float duracao;
	public int qtdAlunos;
	public int cargaHoraria;
	
	public Curso(String nomeCurso, float duracaoCurso, int qtdAlunosCurso, int cargaHorariaCurso) {
		this.nome = nomeCurso;
		this.duracao = duracaoCurso;
		this.qtdAlunos = qtdAlunosCurso;
		this.cargaHoraria = cargaHorariaCurso;
	}
	
	public String toString() {
		return "Curso: " + this.nome + " - Duração: " + this.duracao + " - Qtd. Alunos: " + this.qtdAlunos + " - Carga Horária: " + this.cargaHoraria;
	}
}
}
public class TesteCursos {

	public static void main(String[] args) {
		Curso engComp = new Curso("Engenharia de Computação", 6.00, 40, 4000.00);
	}

}*/

/** Questão 1; Uma casa está para uma planta arquitetônica assim com um(a) objeto está para uma classe. A palavra chave class em uma declaração de classe é imediatamente seguida pelo nome da classe. A palavra chave new solicita memória do sistema para armazenar um objeto e então chama o construtor da classe correspondente, que retorna uma referência para o objeto inicializado. Um objeto não inicializado tem como valor padrão null. A palavra chave this pode ser usada para resolver ambiguidades ao se acessar variáveis locais e atributos, apontando para a atual instância do objeto.*/
/**Quando definimos métodos diferentes com assinaturas diferentes mas nomes iguais, estamos fazendo uso da sobrecarga de métodos. THAYCKOWISK CORREIA CAMPOS*/
