package model;

public class Mamifero extends Animal {

	private String alimento;

	public Mamifero() {
		super();
		setAmbiente("Terra");
	}

	public void alteraAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String alimento() {
		return this.alimento;
	}

	@Override
	public void dados() {
		System.out.println("Mamifero");
		System.out.println("Nome: " + getNome());
		System.out.println("Comprimento: " + getComprimento() + " cm");
		System.out.println("Patas: " + getPatas());
		System.out.println("Cor: " + getCor());
		System.out.println("Ambiente: " + getAmbiente());
		System.out.println("Velocidade: " + getVelocidade() + " m/s");
		System.out.println("Alimento: " + alimento);
	}
}
