package model.services;

public class PaypalService implements OnlinePaymentService {

	private static final double fee = 0.02;
	private static final double feeMonths = 0.01;

	@Override
	public double paymentFee(double amount) {

		return amount * fee;
	}

	@Override
	public double interest(double amount, int months) {

		return amount * feeMonths * months;

	}

}
