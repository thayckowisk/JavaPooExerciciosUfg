	import java.util.Scanner;
	 
	public class Media2 {
	
		public static void main(String[] args) {
			double[] numeros = new double[10]; 
			System.out.printf("Digite %d números: ", numeros.length);
			
			Scanner leitor = new Scanner(System.in);
			
			for (int i = 0; i < 10; i++) {
				numeros[i] = leitor.nextDouble();
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

