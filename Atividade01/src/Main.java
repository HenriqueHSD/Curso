import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Exercicio 01 Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Digite dois numero: ");
		 * 
		 * int n1 = sc.nextInt(); int n2 = sc.nextInt();
		 * 
		 * int soma = n1 + n2;
		 * 
		 * System.out.println("Soma = " + soma);
		 * 
		 * sc.close();
		 */

		/*
		 * Exercicio 02 Locale.setDefault(Locale.US);
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * double area, raio, pi = 3.14159;
		 * 
		 * System.out.println("Digite o valor do raio:");
		 * 
		 * raio = sc.nextDouble();
		 * 
		 * area = pi * (Math.pow(raio, 2));
		 * 
		 * System.out.printf("A = %.4f", area);
		 * 
		 * sc.close();
		 */

		/*
		 * Exercicio 03 Scanner sc = new Scanner(System.in); int A, B, C, D, dif;
		 * 
		 * System.out.println("Digite 4 numeros"); A = sc.nextInt(); B = sc.nextInt(); C
		 * = sc.nextInt(); D = sc.nextInt();
		 * 
		 * dif = (A * B - C * D);
		 * 
		 * System.out.println("DIFERENCA = " + dif);
		 * 
		 * sc.close();
		 */

		/*
		 * Exercicio 04 Locale.setDefault(Locale.US);
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int numeroFucionario, numeroHoras;
		 * 
		 * double valorHora, salario;
		 * 
		 * System.out.print("Digite o numero do funcinario: "); numeroFucionario =
		 * sc.nextInt(); System.out.println();
		 * 
		 * System.out.print("Digite seu numero de horas: "); numeroHoras = sc.nextInt();
		 * System.out.println();
		 * 
		 * System.out.print("Valor que recebe por hora: "); valorHora = sc.nextDouble();
		 * 
		 * salario = numeroHoras * valorHora;
		 * 
		 * System.out.println("NUMBER = " + numeroFucionario);
		 * 
		 * System.out.printf("SALARY = U$ %.2f %n", salario);
		 * 
		 * sc.close();
		 */

		/*
		 * Exercicio 05 Locale.setDefault(Locale.US);
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int c1, n1, c2, n2; double v1, v2, total;
		 * 
		 * System.out.println("Digite o codigo, numero e valor da peça 1");
		 * 
		 * c1 = sc.nextInt(); n1 = sc.nextInt(); v1 = sc.nextDouble();
		 * 
		 * System.out.println("Digite o codigo, numero e valor da peça 2");
		 * 
		 * c2 = sc.nextInt(); n2 = sc.nextInt(); v2 = sc.nextDouble();
		 * 
		 * total = (v1 * n1) + (v2 * n2);
		 * 
		 * System.out.printf("VALOR A PAGAR: R$ %.2f %n", total);
		 * 
		 * sc.close();
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;

		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		sc.close();
	}

}
