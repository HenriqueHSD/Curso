package application;

import java.util.Locale;
import java.util.Scanner;

import emtities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		System.out.printf("Nota Final = %.2f%n", aluno.notaTotal());

		if (aluno.notaTotal() < 60.0) {

			System.out.println("FAILED");
			System.out.printf("Falta %.2f para voce passar%n", aluno.notaFinal());

		} else {

			System.out.println("PASS");
		}

		sc.close();

	}

}
