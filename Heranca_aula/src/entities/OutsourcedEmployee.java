package entities;

public class OutsourcedEmployee extends Employee {
	private Double addtionalcharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addtionalcharge) {
		super(name, hours, valuePerHour);
		this.addtionalcharge = addtionalcharge;
	}

	public Double getAddtionalcharge() {
		return addtionalcharge;
	}

	public void setAddtionalcharge(Double addtionalcharge) {
		this.addtionalcharge = addtionalcharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + addtionalcharge * 1.1;
		
	}

}
