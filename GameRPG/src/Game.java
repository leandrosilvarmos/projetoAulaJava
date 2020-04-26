import java.util.Random;

public class Game {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Ola Mundo");
//
	
		Random rand = new Random(); int Qtataque = rand.nextInt(10);
		
	
		
		Combatente c = new Dragao (100);
		Combatente a = new Arqueiro(20);
		
		c.atribuirNome("Leandro");
		c.exibirNome();
		c.receberAtaque(Qtataque);
		
		
		
		 System.out.println(c.estaMorto());
		 System.out.println(c.estaVivo());
				
	}

}
