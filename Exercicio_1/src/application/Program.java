package application;

import java.util.Locale;
import java.util.Scanner;

import emtities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();

		System.out.println("Enter rectangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();

		System.out.printf("Area = %.2f%n", retangulo.area());
		System.out.printf("Perimeter = %.2f%n", retangulo.perimeter());
		System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());

		sc.close();

	}

}
