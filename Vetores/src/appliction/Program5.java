package appliction;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, posicao;
		double maior;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		double[] vect = new double[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}

		maior = 0;
		posicao = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				posicao = i;
			}

		}

		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d", posicao);

		sc.close();

	}

}
