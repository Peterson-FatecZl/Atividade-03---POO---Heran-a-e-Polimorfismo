package model;

public class ContaBancaria {

	private String cliente;
	private int num_conta;
	private float saldo;

	// Construtores
	public ContaBancaria() {
		super();
	}

	public ContaBancaria(String cliente, int num_conta, float saldo) {
		this.cliente = cliente;
		this.num_conta = num_conta;
		this.saldo = saldo;
	}

	// Metodos
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNum_conta() {
		return num_conta;
	}

	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void sacar(float valorDeSaque) {
		if (valorDeSaque > saldo) {
			System.out.println("Saldo insuficiente Para valor informado");
		} else {
			saldo -= valorDeSaque;
			System.out.printf("Voce sacou %.2f e seu saldo restante e: %.2f %n",valorDeSaque, saldo);
		}
	}

	public void depositar(float valorDoDeposito) {
		saldo += valorDoDeposito;
		System.out.println("Deposito Realizado! Seu saldo e: " + saldo);
	}

}
