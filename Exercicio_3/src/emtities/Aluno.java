package emtities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double notaTotal() {
		return nota1 + nota2 + nota3;
	}

	public double notaFinal() {

		if (notaTotal() < 60.0) {
			return 60.0 - notaTotal();
		} else {
			return 0.0;
		}

	}

}
