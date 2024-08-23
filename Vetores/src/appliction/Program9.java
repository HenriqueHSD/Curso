package appliction;

import java.util.Locale;
import java.util.Scanner;

import entities.MaisVelho;

public class Program9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, velho, id;

		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();

		MaisVelho[] vect = new MaisVelho[n];

		for (int i = 0; i < vect.length; i++) {

			System.out.printf("Dados da %da pessoa:%n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();

			vect[i] = new MaisVelho(name, idade);

		}

		velho = 0;
		id = 0;
		for (int i = 0; i < vect.length; i++) {

			if (vect[i].getIdade() > velho) {
				velho = vect[i].getIdade();
				id = i;

			}
		}

		System.out.printf("PESSOA MAIS VELHA: %s", vect[id].getName());

		sc.close();

	}

}
