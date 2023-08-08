
public class Principal {
	
	public static void main(String[] args) {
		Compositor Lana = new Compositor("Lana del Rey", "Estados Unidos");
		String[] nomesDasMusicas = new String[2];
		
		nomesDasMusicas[0] = new String("Say Yes to Heaven");
		nomesDasMusicas[1] = "National Anthem"; 
		Lana.definirMusicas(nomesDasMusicas);
		Lana.listarMusicas();
		System.out.println("------------------------------");
		
		Compositor Manu = new Compositor("Manu Gavassi", "Brasil");
	
		String[] listaDeMusicas = {"Áudio de Desculpas", "Dever ser Horrível Dormir sem Mim", "Eu Te Quero"}; 
		
		Manu.definirMusicas(listaDeMusicas);
		Manu.listarMusicas();
}

}
