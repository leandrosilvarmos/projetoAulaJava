import java.util.Random;

public class Batalha {
	
	Combatente combatente1;
	Combatente combatente2;
	Random rand = new Random(); 

	
	public Batalha(Combatente combatente1, Combatente combatente2) {
		
		this.combatente1 = combatente1;
		this.combatente2 = combatente2;
		
	}
	
	
	public void batalhar() {
		while(combatente1.estaVivo() && combatente2.estaVivo()) {
			int dado1 = rand.nextInt(10);
			int dado2 = rand.nextInt(10);
			combatente1.receberAtaque(dado1);
			combatente2.receberAtaque(dado2);
			System.out.println(combatente1.getVida()); 
			System.out.println(combatente2.getVida()); 
			
		}
	}
	
	public Combatente vencedor() {
		if(combatente1.estaVivo()) {
				return combatente1;
		}
		else {
			return combatente2;
		}
		
	}
	
}
