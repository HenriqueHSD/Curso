package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.next();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            List<Employee> list = new ArrayList<>();

            String line = bf.readLine();
            while (line != null) {
                String[] vet = line.split(",");
                String name = vet[0];
                String email = vet[1];
                Double salary = Double.parseDouble(vet[2]);
                list.add(new Employee(name, email, salary));

                line = bf.readLine();
            }
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            List<String> email = list.stream()
                    .filter(p -> p.getSalary() > salary)
                    .map(p -> p.getEmail()).sorted()
                    .collect(Collectors.toList());

            System.out.printf("Email of people whose salary is more than %.2f%n", salary);
            email.forEach(System.out::println);

            double sum = list.stream()
                    .filter(p -> p.getName().charAt(0) == 'M')
                    .map(p -> p.getSalary())
                    .reduce(0.0, (a, b) -> a + b);

            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", sum);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        sc.close();


    }
}
