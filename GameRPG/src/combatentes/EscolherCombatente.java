package combatentes;
import java.util.Scanner;

import personagens.Arqueiro;
import personagens.Barbaro;
import personagens.Bruxa;
import personagens.Doende;
import personagens.Dragao;
import personagens.DragaoBranco;
import personagens.DragaoGelo;
import personagens.Fadas;
import personagens.Gigante;
import personagens.Guerreiro;
import personagens.Humano;
import personagens.Lobisomen;
import personagens.Mago;
import personagens.MagoDruida;
import personagens.Orc;
import personagens.OrcMontanha;
public class EscolherCombatente {

	public Combatente escolher() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("Escolha seu combatente Tipos de Dragão:"
		+ "\n" + "Dragão Comum: Digite1 / Dragão Branco: Digite 2 / Dragão de Gelo: Digite3"
		+ "\n" + "Escolha seu combatente Tipos de Humano:"
		+ "\n" + "Humano: Digite 4 / Arqueiro: Digite 5 / Lobisomen: Digite 6 / Bruxa: Digite 7"
		+ "\n" + "Escolha seu combatente Tipos de Orc:"
		+ "\n" + "Orc: Digite8 / Orc da Montanha: Digite9" 
		+ "\n" + "Escolha seu combatente Tipo Seres Magicos:"
		+ "\n" + "Mago: Digite 10 / Mago Druida: Digite 11 / Fada do Bosque: Digite 12 / Duende: Digite 13"
		+ "\n" + "Escolha seu combatente Tipo Guerreiros:"
		+ "\n" + "Guerreiro comum: Digite 14 / Gigante do Norte: Digite 15 / Barbaro: Digite 16");
		int valor1 = scanner.nextInt();

		if(valor1 == 1) {
			return new Dragao(100);
		}else if(valor1 ==2) {
			return new DragaoBranco(100);
		}else if(valor1 ==3){
		return new DragaoGelo(100);
	}else if (valor1 == 4){
		return new Humano(100);
	}else if(valor1 == 5) {
		return new Arqueiro(100);
	}else if(valor1 == 6) {
		return new Lobisomen(100);
	}else if (valor1 == 7){
		return new Bruxa(100);
	}else if(valor1 == 8) {
		return new Orc(100);
	}else if(valor1 == 9) {
		return new OrcMontanha(100);
	}else if(valor1 == 10) {
		return new Mago(100);
	}else if(valor1 == 11) {
		return new MagoDruida(100);
	}else if(valor1 == 12) {
		return new Fadas(100);
	}else if(valor1 == 13) {
		return new Doende(100);
	}else if(valor1 == 14) {
		return new Guerreiro(100);
	}else if(valor1 ==15) {
		return new Gigante(100);
	}else if(valor1 == 16) {
		return new Barbaro(100);
	}else {
		return null;
	}
}
	
	
}
