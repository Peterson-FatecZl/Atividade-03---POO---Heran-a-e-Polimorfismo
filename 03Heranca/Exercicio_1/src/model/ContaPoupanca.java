package model;

public class ContaPoupanca extends ContaBancaria {

	private int diaDeRendimento;

	//Construtores
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}

	// Metodos
	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}

	public float calcularNovoSaldo(float taxaDeRendimento) {
		float rendimento = taxaDeRendimento * getSaldo();
		float saldoFinal = getSaldo() + rendimento;
		return saldoFinal;
	}

}
