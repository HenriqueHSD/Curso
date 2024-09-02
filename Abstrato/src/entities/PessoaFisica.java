package entities;

public class PessoaFisica extends Contribuinte {
	private Double gastoSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double income, Double gastoSaude) {
		super(name, income);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double imposto() {
		if (getIncome() < 20000.00) {
			return getIncome() * 0.15 - gastoSaude * 0.5;
		} else {
			return getIncome() * 0.25 - gastoSaude * 0.5;
		}

	}

}
