package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Student> a = new HashSet<>();
		Set<Student> b = new HashSet<>();
		Set<Student> c = new HashSet<>();

		System.out.print("How many students for course A? ");
		int nuA = sc.nextInt();

		for (int i = 0; i < nuA; i++) {
			int num = sc.nextInt();
			a.add(new Student(num));
		}
		
		System.out.print("How many students for course B? ");
		int nuB = sc.nextInt();

		for (int i = 0; i < nuB; i++) {
			int num = sc.nextInt();
			b.add(new Student(num));
		}
		
		System.out.print("How many students for course C? ");
		int nuC = sc.nextInt();

		for (int i = 0; i < nuC; i++) {
			int num = sc.nextInt();
			c.add(new Student(num));
		}
		
		Set<Student> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total de alunos: "+total.size());

		
		
		
		sc.close();

	}

}
