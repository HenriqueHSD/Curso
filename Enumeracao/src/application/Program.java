package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HorContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String nameDepartment = sc.nextLine();

		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine();
		System.out.print("Base salary: ");
		double salary = sc.nextDouble();

		Worker worker = new Worker(name, WorkerLevel.valueOf(level), salary, new Departament(nameDepartment));

		System.out.print("How many contracts to this worker? ");
		int contract = sc.nextInt();

		for (int i = 0; i < contract; i++) {
			System.out.println();
			System.out.printf("Enter contract #%d data:%n", i + 1);
			System.out.print("Date (DD/MM/YYYY): ");
			String data = sc.next();
			LocalDate dataContract = LocalDate.parse(data, format);
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();

			HorContract contracts = new HorContract(dataContract, value, hours);
			worker.addContract(contracts);
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String date = sc.next();
		int month = Integer.parseInt(date.substring(0, 2));
		int year = Integer.parseInt(date.substring(3));
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getDepartament().getName());
		System.out.println("Income for "+date+": "+ String.format("%.2f", worker.income(year, month)));
		

		sc.close();

	}

}
