package combatentes;
import java.util.ArrayList;
import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
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
			
			int quantidadeAtaque = combatente2.atacar();
			combatente1.receberAtaque(quantidadeAtaque);
			
			int quantidadeAtaque2 = combatente1.atacar();
			combatente2.receberAtaque(quantidadeAtaque2);
			System.out.println("\n");
			System.out.println("O combatente " + combatente1.retornarNome() +  " recebeu o ataque = " + quantidadeAtaque); 
			System.out.println("O combatente " + combatente2.retornarNome() +  " recebeu o ataque = " + quantidadeAtaque2); 
			
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
