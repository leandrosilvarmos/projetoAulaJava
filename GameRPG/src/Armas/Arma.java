package Armas;

public class Arma {

	protected int dano =  5 ;

	public int aumentaAtaque(int ataque) {
		System.out.println("A arma acrescentou: " + dano + " pontos no ataque");
		return ataque + dano;
		
	}
	
	
}
