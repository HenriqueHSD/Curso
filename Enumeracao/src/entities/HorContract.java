package entities;

import java.time.LocalDate;

public class HorContract {
	
	private LocalDate data;
	private Double valuePerHour;
	private Integer hours;

	public HorContract() {

	}

	public HorContract(LocalDate data, Double valuePerHour, Integer hours) {
		this.data = data;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double totalValue() {
		return valuePerHour * hours;
	}

}
