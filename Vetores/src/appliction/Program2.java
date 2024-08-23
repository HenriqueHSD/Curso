package appliction;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int numero = sc.nextInt();

		double[] vetor = new double[numero];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();

		}

		System.out.printf("VALORES = %.1f  %.1f  %.1f  %.1f%n", vetor[0], vetor[1], vetor[2], vetor[3]);

		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		System.out.printf("SOMA = %.2f%n", soma);

		double media = soma / numero;
		System.out.printf("MEDIA = %.2f%n", media);

		sc.close();

	}

}
