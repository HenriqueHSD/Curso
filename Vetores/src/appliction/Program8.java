package appliction;

import java.util.Locale;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, soma, par;
		double media;

		System.out.print("Quantos elementeos vai ter o vetor? ");
		n = sc.nextInt();

		int[] vect = new int[n];
		soma = 0;
		par = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();

			if (vect[i] % 2 == 0) {
				soma += vect[i];
				par ++;

			}
		}

		System.out.println();
		if (soma > 0) {
			media = (double) soma / par;
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		} else {
			System.out.println("NENHUM NUMERO PAR");

		}

		sc.close();

	}

}
