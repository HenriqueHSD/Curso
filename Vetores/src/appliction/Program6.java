package appliction;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] resultado = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i =0; i < a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i =0; i < b.length;i++) {
			b[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for(int i =0; i < resultado.length;i++) {
			resultado[i] =  a[i] + b[i];
			System.out.println(resultado[i]);
			
		}
		
		
		
		sc.close();

	}

}
