package model;

public class Peixe extends Animal {

	private String caracteristica;

	// Construtor
	public Peixe() {
		super();
		this.caracteristica = "Barbatanas e cauda";
		setPatas(0);
		setAmbiente("Mar");
		setCor("Cinzenta");
	}

	// Metodos
	public void alteraCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String caracteristica() {
		return caracteristica;
	}

	@Override
	public void dados() {
		System.out.println("Peixe");
		System.out.println("Nome: " + getNome());
		System.out.println("Comprimento: " + getComprimento() + " cm");
		System.out.println("Cor: " + getCor());
		System.out.println("Velocidade: " + getVelocidade() + " m/s");
	}
}
