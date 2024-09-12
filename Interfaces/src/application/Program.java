package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");
		
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Numero: ");
		int num = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		System.out.print("Valor do contrato: ");
		double price = sc.nextDouble();
		
		Contract contract = new Contract(num, date, price);
		
		System.out.print("Entre com o numero de parcelas: ");
		int parcel = sc.nextInt();
		
		ContractService service = new ContractService(new PaypalService());
		service.processContract(contract, parcel);
		
		System.out.println("Parcelas: ");
		
		for(Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		
		
		
		
		sc.close();

	}

}
