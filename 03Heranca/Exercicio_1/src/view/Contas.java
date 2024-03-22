package view;

import model.*;

public class Contas {

	public static void main(String[] args) {

		ContaEspecial contaEspecial = new ContaEspecial(1000);
		ContaPoupanca contaPoupanca = new ContaPoupanca(23);
		//TODO: Determinacoes do Exercicio
		/*Incluir dados relativos a(s) conta(s) de um cliente de Conta Poupança e Conta Especial;*/
		contaEspecial.setCliente("Cliente 1");
		contaEspecial.setNum_conta(1322);
		contaEspecial.setSaldo(3200.22f);
		
		contaPoupanca.setCliente("Cliente Poup");
		contaPoupanca.setNum_conta(9999);
		contaPoupanca.setSaldo(5000);		
		
		/*Sacar um determinado valor da(s) sua(s) conta(s);*/
		contaEspecial.sacar(200);
		contaPoupanca.sacar(100);
		
		/*Sacar um valor superior ao saldo;*/
		contaPoupanca.sacar(6000);
		
		/*• Sacar um valor dentro do limite da conta especial e acima do limite;*/
		contaEspecial.sacar(3900);
		contaEspecial.sacar(8000);
		
		/*Depositar um determinado valor na(s) sua(s) conta(s);*/
		contaEspecial.depositar(2000);
		contaPoupanca.depositar(2000);
		
		/*Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que possuem conta poupança;*/
		contaPoupanca.calcularNovoSaldo(0.1f);
		
		/*Mostrar os dados da(s) conta(s) de um cliente;*/
		System.out.println(contaEspecial.toString());
		
	}

}
