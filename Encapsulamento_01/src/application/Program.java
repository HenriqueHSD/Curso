package application;

import java.util.Locale;
import java.util.Scanner;

import emitities.Conta;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Enter account number: ");
		int numero = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char opcicao = sc.next().charAt(0);

		if (opcicao == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositoOpcicao = sc.nextDouble();
			conta = new Conta(numero, name, depositoOpcicao);

		} else {
			conta = new Conta(numero, name);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.depositor(deposito);

		System.out.println("Update account data: ");
		System.out.println(conta);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		deposito = sc.nextDouble();
		conta.saque(deposito);

		System.out.println("Update account data: ");
		System.out.println(conta);

		sc.close();

	}

}
