package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas vao alugar os quantos? ");
		int n = sc.nextInt();

		Estudante[] vect = new Estudante[10];

		for (int i = 0; i < n; i++) {
			System.out.printf("Reserva #%d%n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			System.out.println();

			vect[quarto] = new Estudante(nome, email);

		}

		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {

				System.out.printf("%d: %s%n", i, vect[i]);

			}
		}

		sc.close();
	}

}
