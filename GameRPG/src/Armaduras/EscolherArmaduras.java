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
		System.out.println("Escolha suas Armadura:" 
							+ "\n" + "Armadura Comum: Digite1 / Escudo Comum: Digite2"
							+ "\n" 
							+ "Capacete Comum: Digite3 / Escudo de Ouro: Digite 4"
							+"\n" + "Armadura de Couro: Digite 5");
		
		
		int escolha = scanner.nextInt();
		
		if(escolha == 1) {
			return new Armadura();
		}else if(escolha ==2) {
			return new Escudo();
		}else if(escolha == 3){
			return new Capacete();
		}else if(escolha == 4) {
			return new EscudoOuro();
		}else {
			return new ArmaduraCouro();
		}
	}
	
}
