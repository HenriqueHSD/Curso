package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePayment;

	public ContractService(OnlinePaymentService onlinePayment) {
		this.onlinePayment = onlinePayment;
	}

	public void processContract(Contract contract, int months) {
		double installments = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			LocalDate duDate = contract.getDate().plusMonths(i);
			double fee = installments + onlinePayment.interest(installments, i);
			double total = fee + onlinePayment.paymentFee(fee);

			contract.getInstallments().add(new Installment(duDate, total));

		}

	}
}
