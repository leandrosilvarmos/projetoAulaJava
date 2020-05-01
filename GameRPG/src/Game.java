import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		
		EscolherCombatente escolher = new EscolherCombatente();
		Combatente c = escolher.escolher();
		Combatente a = escolher.escolher();
		Batalha b = new Batalha (c , a);
		
		
		b.batalhar();
		
		Combatente vencedor = b.vencedor();
		System.out.println(vencedor.retornarNome());
		
				
	}

}
