package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employee will be registered? ");
		int n = sc.nextInt();

		List<Employee> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Employee #%d%n", i + 1);

			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			Employee emplo = new Employee(id, name, salary);

			list.add(emplo);

		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();

		//Integer pos = position(list, idSalary);
		
		Employee em = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

		//if (pos == null) {
		if(em == null) {
			System.out.println("This id  does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			//list.get(pos).increaseSalary(percent);
			em.increaseSalary(percent);

		}
		System.out.println();
		System.out.println("List of employee:");
		for (Employee emp : list) {
			System.out.println(emp);

		}

		sc.close();

	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
