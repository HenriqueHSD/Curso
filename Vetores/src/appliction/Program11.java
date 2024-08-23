package appliction;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosPessoa;

public class Program11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, numeroHomem, numeroMulher;
		double menorAltura, maiorAltura, somaMulher;

		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();

		DadosPessoa[] vect = new DadosPessoa[n];

		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			char genero = sc.next().charAt(0);

			vect[i] = new DadosPessoa(altura, genero);
		}
		
		menorAltura = vect[0].getAltura();
		maiorAltura = vect[0].getAltura();
		
		for(int i=0; i<vect.length;i++) {
			if (vect[i].getAltura() < menorAltura) {
				menorAltura = vect[i].getAltura();
			}

			if (vect[i].getAltura() > maiorAltura) {
				maiorAltura = vect[i].getAltura();
			}
		
			
		}

		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);

		somaMulher = 0;
		numeroHomem = 0;
		numeroMulher = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getGenero() == 'F') {
				somaMulher += vect[i].getAltura();
				numeroMulher++;
			} else {
				numeroHomem++;
			}
		}

		double media = somaMulher / numeroMulher;
		
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.printf("Numero de homens = %d", numeroHomem);
		
		sc.close();

	}

}
