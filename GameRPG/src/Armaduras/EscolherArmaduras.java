package Armaduras;

import java.util.Scanner;

import Armas.Adaga;
import Armas.ArcoFogo;
import Armas.Arma;
import Armas.CajadoMagico;
import Armas.Espada;

public class EscolherArmaduras {

	public Armadura escolher() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha suas Armas:" 
							+ "\n" + "Arma Comum: Digite1" + "\n" 
							+ "Espada: Digite2" + "\n" 
							+ "Adaga: Digite3"
							+ "\n" + "Arco com flecha de Fogo: Digite 4"
							+ "\n" + "Cajado magico: Digite 5");
		
		
		int escolha = scanner.nextInt();
		
		if(escolha == 1) {
			return new Armadura();
		}else if(escolha ==2) {
			return new Escudo();
		}else if(escolha == 3){
			return new Capacete();
		}else if(escolha == 4) {
			return new ArcoFogo();
		}else {
			return new CajadoMagico();
		}
	}
	
}
