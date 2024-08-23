package appliction;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, soma;

		System.out.printf("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		int[] vect = new int[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um nemero: ");
			vect[i] = sc.nextInt();

		}
		
		System.out.println();
		soma = 0;
		System.out.println("NUEMROS PARES: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);

				soma++;

			}
		}
		System.out.println();
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES = %d", soma);

		sc.close();

	}

}
