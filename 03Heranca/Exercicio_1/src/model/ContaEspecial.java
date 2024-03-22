package model;

public class ContaEspecial extends ContaBancaria{

	private float limite;

	//Construtores
	public ContaEspecial() {
		super();
	}

	public ContaEspecial(float limite) {
		this.limite = limite;
	}

	//Metodos
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public void sacar(float valorDoSaque) {
		if(valorDoSaque > (getSaldo()+ limite)) {
			System.out.println("Saque nao pode ser realizado pois ultrapassou o Saldo e o limite");
		}else {
			float saldoFinal = getSaldo() - valorDoSaque;
			setSaldo(saldoFinal);
			System.out.println("Saque Realizado! Seu saldo atual e: "+saldoFinal);
		}
	}

	@Override
	public String toString() {
		return "\nContaEspecial \nlimite=" + limite +
			   ", \ngetLimite()=" + getLimite() +
			   ", \ngetCliente()=" + getCliente() +
			   ", \ngetNum_conta()=" + getNum_conta() +
			   ", \ngetSaldo()=" + getSaldo();
	}
	
	
}
