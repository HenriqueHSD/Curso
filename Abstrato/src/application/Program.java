package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuinte> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char cha = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();

			if (cha == 'i') {
				System.out.print("Health expenditures: ");
				double saude = sc.nextDouble();
				list.add(new PessoaFisica(name, income, saude));
			} else {
				System.out.print("Number of employees: ");
				int pessoa = sc.nextInt();
				list.add(new PessoaJuridica(name, income, pessoa));
			}

		}

		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0.0;
		for (Contribuinte c : list) {
			double taxa = c.imposto();
			System.out.println(c.getName() + ": $" + String.format("%.2f", taxa));
			sum += taxa;
		}
		System.out.printf("TOTAL TAXES: $%.2f", sum);

		sc.close();

	}

}
