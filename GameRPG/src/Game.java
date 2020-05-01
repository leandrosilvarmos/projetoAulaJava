import java.util.Random;

public class Game {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Ola Mundo");
//
	
		Random rand = new Random(); 
		
		
		Combatente c = new Orc (100);
		Combatente a = new Arqueiro(100);
		
		while(c.estaVivo() && a.estaVivo()) {
			int dado1 = rand.nextInt(10);
			int dado2 = rand.nextInt(10);
			c.receberAtaque(dado1);
			a.receberAtaque(dado2);
			System.out.println(c.getVida()); 
			System.out.println(a.getVida()); 
			
		}
		
		if(c.estaVivo()) {
			System.out.println(c.retornarNome());
		}
		else {
			System.out.println(a.retornarNome());
		}
		
		
				
	}

}
