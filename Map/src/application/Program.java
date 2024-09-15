package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votes = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] vet = line.split(",");
				String name = vet[0];
				int amount = Integer.parseInt(vet[1]);

				if (votes.containsKey(name)) {
					int numberVotes = votes.get(name);
					votes.put(name, amount + numberVotes);
				} else {
					votes.put(name, amount);
				}

				line = br.readLine();

			}

			for (String key : votes.keySet()) {
				System.out.println(key +": "+votes.get(key));

			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
