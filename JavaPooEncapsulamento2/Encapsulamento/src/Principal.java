public class Principal {
	
	public static void main(String[] args) {
		
		System.out.printf("Neste momento existem %d compositores\n", Compositor.getTotalCompositores());
		System.out.println("------------------------------");
		
		Compositor manu = new Compositor("Manu Gavassi", "Aúdio de Desculpas");
		String[] nomesDasMusicas = new String[2];
		
		nomesDasMusicas[1] = "Aúdio de desculpas"; 
		manu.definirMusicas(nomesDasMusicas);
		
		manu.listarMusicas();
		
		System.out.println("------------------------------");
		
		Compositor lana = new Compositor("Lana del Rey", "EUA");
	
		String[] listaDeMusicas = {"Ride", "Lolita", "Peppers"}; 
		
		lana.definirMusicas(listaDeMusicas);
		
		lana.listarMusicas();
		
		System.out.println("------------------------------");
		System.out.printf("Ao total foram criados %d compositores\n", Compositor.getTotalCompositores());
}

}