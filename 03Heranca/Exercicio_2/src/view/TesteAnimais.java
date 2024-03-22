package view;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class TesteAnimais {

	public static void main(String[] args) {
		Animal camelo = new Animal();
		Peixe tubarao = new Peixe();
		Mamifero urso_do_canada = new Mamifero();

		// Camelo
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2.0f);

		// Tubarao
		tubarao.setNome("Tubarao");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5f);
		tubarao.caracteristica();

		// Urso do Canada
		urso_do_canada.setNome("Urso-do-canada");
		urso_do_canada.setComprimento(180);
		urso_do_canada.setCor("Vermelho");
		urso_do_canada.setVelocidade(0.5f);
		urso_do_canada.alteraAlimento("Mel");
		
		//Zoologico
		List<Animal> jardimZoologico = new ArrayList<Animal>();
		
		jardimZoologico.add(camelo);
		jardimZoologico.add(tubarao);
		jardimZoologico.add(urso_do_canada);

		//Exibe Animais
		for(int i = 0; i < jardimZoologico.size(); i++) {
			jardimZoologico.get(i).dados();
			System.out.println();
		}
	}

}
