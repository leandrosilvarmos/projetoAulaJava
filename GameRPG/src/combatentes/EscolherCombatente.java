package combatentes;
import java.util.Scanner;

import personagens.Arqueiro;
import personagens.Dragao;
import personagens.Orc;
public class EscolherCombatente {

	public Combatente escolher() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha seu combatente: Orc: Digite1 / Arqueiro: Digite2 / Dragão: Digite3");
		int valor1 = scanner.nextInt();

		if(valor1 == 1) {
			return new Orc(100);
		}else if(valor1 ==2) {
			return new Arqueiro(100);
		}else{
		return new Dragao(100);
	}
	
}
	
	
}
