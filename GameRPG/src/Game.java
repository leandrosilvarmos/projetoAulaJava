import java.util.Random;

public class Game {

	public static void main(String[] args) {
		
		Combatente c = new Orc (100);
		Combatente a = new Arqueiro(100);
		Batalha b = new Batalha (c , a);
		
		
		b.batalhar();
		
		Combatente vencedor = b.vencedor();
		System.out.println(vencedor.retornarNome());
		
				
	}

}
