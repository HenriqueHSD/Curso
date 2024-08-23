package appliction;

import java.util.Locale;
import java.util.Scanner;

import entities.Aprovados;

public class Program10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("Quantos aluno serao digitados? ");
		n = sc.nextInt();

		Aprovados[] vect = new Aprovados[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno%n", i + 1);
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();

			vect[i] = new Aprovados(nome, nota1, nota2);

		}

		System.out.println("Alunos aprovados:");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].notaTotal() >= 6.0) {
				System.out.println(vect[i].getName());

			}

		}

		sc.close();

	}

}
