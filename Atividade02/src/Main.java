import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Exercício 01 Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Digite um valor: "); int n1 = sc.nextInt();
		 * 
		 * if (n1 < 0) {
		 * 
		 * System.out.println("NEGATIVO");
		 * 
		 * } else {
		 * 
		 * System.out.println("NAO NEGATIVO"); }
		 * 
		 * sc.close();
		 */

		/*
		 * Exercício 02 Scanner sc = new Scanner(System.in);
		 * System.out.println("Digite um N: "); int N = sc.nextInt();
		 * 
		 * if (N % 2 == 0) {
		 * 
		 * System.out.println("PAR");
		 * 
		 * } else {
		 * 
		 * System.out.println("IMPAR"); }
		 * 
		 * sc.close();
		 */

		/*
		 * Exercício 03 Scanner sc = new Scanner(System.in);
		 * System.out.println("Digite dois Ns: "); int n1 = sc.nextInt(); int n2 =
		 * sc.nextInt();
		 * 
		 * if (n1 % n2 == 0 || n2 % n1 == 0) { System.out.println("Sao Multiplos"); }
		 * else { System.out.println("Nao sao Multiplos");
		 * 
		 * }
		 * 
		 * sc.close();
		 */

		/*
		 * Exercício 04 Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Digite hora inicial e o final: "); int horaInicial =
		 * sc.nextInt(); int horaFinal = sc.nextInt(); int duracao;
		 * 
		 * if (horaInicial < horaFinal) {
		 * 
		 * duracao = horaFinal - horaInicial;
		 * System.out.printf("O JOGO DUROU %d HORA(S)", duracao); } else {
		 * 
		 * duracao = 24 - horaInicial + horaFinal;
		 * System.out.printf("O JOGO DUROU %d HORA(S)", duracao); }
		 * 
		 * sc.close();
		 */

		/*
		 * Exercício 05 Locale.setDefault(Locale.US); Scanner sc = new
		 * Scanner(System.in); System.out.println("Digite o codigo e a quantidade: ");
		 * int codigo = sc.nextInt(); int quantidade = sc.nextInt();
		 * 
		 * double total;
		 * 
		 * if (codigo == 1) {
		 * 
		 * total = quantidade * 4.00;
		 * 
		 * } else if (codigo == 2) {
		 * 
		 * total = quantidade * 4.50;
		 * 
		 * } else if (codigo == 3) {
		 * 
		 * total = quantidade * 5.00;
		 * 
		 * } else if (codigo == 4) {
		 * 
		 * total = quantidade * 2.00;
		 * 
		 * } else {
		 * 
		 * total = quantidade * 1.50;
		 * 
		 * }
		 * 
		 * System.out.printf("Total: R$ %.2f %n", total);
		 * 
		 * sc.close();
		 */

		/*
		 * Exercício 06 Locale.setDefault(Locale.US);
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Digite um valor: "); double N = sc.nextDouble();
		 * 
		 * if (N < 0.0 || N > 100.0) { System.out.println("Fora de intervalo"); } else
		 * if (N <= 25.0) { System.out.println("Intervalo [0,25]"); } else if (N <=
		 * 50.0) { System.out.println("Intervalo (25,50]"); } else if (N <= 75.0) {
		 * System.out.println("Intervalo (50,75]"); } else {
		 * System.out.println("Intervalo (75,100]"); }
		 * 
		 * sc.close();
		 * 
		 */
		/*Exercício 07
		 * Locale.setDefault(Locale.US);
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Digite dois valores: "); double x = sc.nextDouble();
		 * double y = sc.nextDouble();
		 * 
		 * if (x == 0.0 && y == 0.0) {
		 * 
		 * System.out.println("Origem");
		 * 
		 * } else if (x > 0.0 && y > 0.0) {
		 * 
		 * System.out.println("Q1");
		 * 
		 * } else if (x < 0.0 && y > 0.0) {
		 * 
		 * System.out.println("Q2");
		 * 
		 * } else if (x < 0.0 && y < 0.0) {
		 * 
		 * System.out.println("Q3");
		 * 
		 * } else {
		 * 
		 * System.out.println("Q4"); }
		 * 
		 * sc.close();
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}

}
