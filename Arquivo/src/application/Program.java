package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		String arquivo = "D:\\Udemy\\JAVA\\Atividade\\origem.csv";

		File path = new File(arquivo);

		String out = path.getParent();
		boolean success = new File(out + "\\out").mkdir();
		String sum = (out + "\\out\\summary.csv");

		List<Product> product = new ArrayList<>();

		try (BufferedReader re = new BufferedReader(new FileReader(arquivo))) {
			String linhas = re.readLine();
			while (linhas != null) {

				String[] vet = linhas.split(",");

				String name = vet[0];
				double price = Double.parseDouble(vet[1]);
				int quantity = Integer.parseInt(vet[2]);

				product.add(new Product(name, price, quantity));

				linhas = re.readLine();

			}
			System.out.println("Lindo com sucesso!!");

			try (BufferedWriter wr = new BufferedWriter(new FileWriter(sum))) {

				for (Product pro : product) {
					wr.write(pro.getName() + ", $" + String.format("%.2f", pro.total()));
					wr.newLine();

				}

				if (success == true) {
					System.out.println("Pasta out criada!");
					System.out.println("Arquivo summary.csv criado!!");
				} else {
					System.out.println("Arquivo summary.csv criado!!");
				}

			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}

		} catch (IOException e) {

			System.out.println("Error: " + e.getMessage());
		}

	}

}
