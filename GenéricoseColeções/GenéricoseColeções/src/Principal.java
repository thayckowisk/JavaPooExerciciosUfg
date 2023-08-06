public class Principal {

	public static void main(String[] args) {
		Baralho superTrunfo = new Baralho("Dinossauros");
		
		
		System.out.println("Baralho carregado com o tema Dinossauros:");
		superTrunfo.carregar();
		superTrunfo.listarCartas();
		
		System.out.println("\nBaralho embaralhado:");
		superTrunfo.embaralhar();
		superTrunfo.listarCartas();
		
		Jogador jogador1 = new Jogador("João");
		Jogador jogador2 = new Jogador("Maria");
		superTrunfo.distribuir( new Jogador[]{ jogador1, jogador2 });
		
		System.out.println("\nMonte do primeiro jogador:");
		jogador1.getMonte().listarCartas();
		
		System.out.println("\nRetirando a carta do topo do monte do primeiro jogador:");
		System.out.println(jogador1.getMonte().pegarDoTopo());
	}

}