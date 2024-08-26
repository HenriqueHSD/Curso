package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String date = sc.next();
		LocalDate birth = LocalDate.parse(date, fmt);

		Client client = new Client(name, email, birth);

		System.out.println("Enter order data:");
		System.out.print("Status: ");
		sc.nextLine();
		String status = sc.nextLine();

		Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);

		System.out.print("How many items to this order? ");
		int many = sc.nextInt();
		for (int i = 0; i < many; i++) {
			System.out.printf("Enter #%d item data:%n", i + 1);
			System.out.print("Product name: ");
			sc.nextLine();
			String nameItem = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();

			Product product = new Product(nameItem, price);

			System.out.print("Quantity: ");
			int quatity = sc.nextInt();

			OrderItem items = new OrderItem(quatity, price, product);

			order.addItem(items);

		}
		System.out.println();
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);

		sc.close();

	}

}
