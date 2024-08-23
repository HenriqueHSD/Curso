package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Departament departament;

	private List<HorContract> contracts = new ArrayList<>();

	public Worker() {

	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HorContract> getContracts() {
		return contracts;
	}

	public void addContract(HorContract contract) {
		contracts.add(contract);

	}

	public void removeContract(HorContract contract) {
		contracts.remove(contract);

	}

	public double income(int year, int month) {
		double sum = baseSalary;

		for (HorContract c : contracts) {
			int c_year = c.getData().getYear();
			int c_month = c.getData().getMonthValue();

			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;

	}

}
