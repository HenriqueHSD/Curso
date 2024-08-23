package appliction;

import java.util.Locale;
import java.util.Scanner;

import entities.Alturas;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantidade, menorIdade;
		double media, porcentagem, soma;

		System.out.print("Quantas pessoas serao digitadas? ");
		quantidade = sc.nextInt();

		Alturas[] vetor = new Alturas[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Dados da %da pessoa%n", i + 1);

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Idade: ");
			int idade = sc.nextInt();

			System.out.print("Altura: ");
			double altura = sc.nextDouble();

			vetor[i] = new Alturas(nome, idade, altura);
		}

		soma = 0;
		menorIdade = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {

				menorIdade++;
			}

			soma += vetor[i].getAltura();
		}

		media = soma / (double)quantidade;

		porcentagem = ((double)menorIdade * 100.0) / quantidade;

		System.out.println();
		System.out.printf("Altura media: %.2f%n", media);

		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}

		}

		sc.close();

	}

}
