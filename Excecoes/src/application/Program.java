package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");

		System.out.print("Number: ");
		int num = sc.nextInt();

		System.out.print("Holder: ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();

		System.out.print("Withdraw limit: ");
		double withdraw = sc.nextDouble();

		Account acc = new Account(num, name, balance, withdraw);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();

		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f%n", acc.getBalance());

		} catch (BusinessException e) {
			System.out.println("Withdraw error: "+e.getMessage());

		}

		sc.close();

	}

}
