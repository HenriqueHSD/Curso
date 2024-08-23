package application;

import java.util.Locale;
import java.util.Scanner;

import emtities.Employye;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employye salario = new Employye();

		System.out.print("Name: ");
		salario.name = sc.nextLine();
		System.out.print("Gross salary: ");
		salario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		salario.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + salario);

		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double porcetagem = sc.nextDouble();
		salario.increaseSalary(porcetagem);

		System.out.println();
		System.out.println("Updated data: " + salario);

		sc.close();

	}

}
