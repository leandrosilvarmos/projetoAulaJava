import java.util.Random;

public class Combatente {


	private int TotalVida;
	private int Ataque;
	
	public void ataque() {
		Random rand = new Random(); int ataque = rand.nextInt(10);
	}
	
	public void contarVida(int TotalVida) {
	this.TotalVida = 100;
	contVida = this.TotalVida - ataque();
	}
	
	

}
