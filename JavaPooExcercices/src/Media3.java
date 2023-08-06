	import java.util.Scanner;

	public class Media3 {
		
		public static void main(String[] args) {
			double[] numeros = new double[10];
			double numeroLido;
			
			System.out.printf("Digite %d números: ", numeros.length);
			
			Scanner leitor = new Scanner(System.in);
			
			for (int i = 0; i < 10; i++) {
				
				while (true) {
					numeroLido = leitor.nextDouble();		 					
					if (numeroLido >= 0 && numeroLido <= 10) 
						break;
					else									 
						System.out.println("Valor inválido! Por favor insira um número entre 0 e 10");
				}
				numeros[i] = numeroLido;
			}
			
			double media = calculaMedia(numeros, numeros.length);

			System.out.println("A média é: " + media);
			
			leitor.close();
		}

		public static double calculaMedia(double[] numeros, int tamanho) {
			int i;
			double media, soma = 0;
			
			for (i = 0; i < tamanho; i++) {
				soma += numeros[i];
			}
			media = soma / tamanho;
			
			return media;
		}

	}

	
