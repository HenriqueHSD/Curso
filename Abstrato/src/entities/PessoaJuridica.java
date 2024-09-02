package entities;

public class PessoaJuridica extends Contribuinte {
	private Integer trabalhador;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double income, Integer trabalhador) {
		super(name, income);
		this.trabalhador = trabalhador;
	}

	public Integer getTrabalhador() {
		return trabalhador;
	}

	public void setTrabalhador(Integer trabalhador) {
		this.trabalhador = trabalhador;
	}

	@Override
	public Double imposto() {
		if (trabalhador < 10) {
			return getIncome() * 0.16;
		} else {
			return getIncome() * 0.14;
		}
	}

}
