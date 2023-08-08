public class Prova {
	private String[] questões;
	private String[] respostas;
	private double nota = 0;
	
	public Prova(String[] questões) {
		this.questões = questões;
		this.respostas = new String[questões.length];
	}
	
	public String[] getQuestões() {
		return questões;
	}
	
	public void setRespostas(String[] respostas) {
		this.respostas = respostas;
	}

	public String[] getRespostas() {
		return respostas;
	}
	
	public void setQuestões(String[] questões) {
		this.questões = questões;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
}
