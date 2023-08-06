
import java.util.Scanner;

public class Medias {
	
	public static void main(String[] args) {
		double num1, num2, num3; 
		System.out.print("Digite três números: ");
		
		Scanner leitor = new Scanner(System.in);
		num1 = leitor.nextDouble();
		num2 = leitor.nextDouble();
		num3 = leitor.nextDouble();
		
		System.out.println("A média é: " + calculaMedia(num1, num2, num3));
		
		leitor.close();
	}

	public static double calculaMedia(double num1, double num2, double num3) {
		return (num1 + num2 + num3) / 3;
	}

}

