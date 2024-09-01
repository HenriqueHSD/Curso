package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int nu = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 1; i <= nu; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePer = sc.nextDouble();

			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additional = sc.nextDouble();

				list.add(new OutsourcedEmployee(name, hours, valuePer, additional));

			} else {

				list.add(new Employee(name, hours, valuePer));
			}

		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee em : list) {
			System.out.println(em.getName() + " - $" + String.format("%.2f", em.payment()));
		}

		sc.close();

	}

}
