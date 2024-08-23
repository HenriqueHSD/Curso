package emitities;

public class Conta {
	
	private int number;
	private String name;
	private double balance;
	private double TAX = 5.00;

	public Conta(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Conta(int number, String name, double inicialDepositor) {
		this.number = number;
		this.name = name;
		depositor(inicialDepositor);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getnumber() {
		return number;
	}

	public void depositor(double balance) {
		this.balance += balance;
	}

	public void saque(double balance) {
		this.balance -= balance + TAX;
	}

	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
	}

}
