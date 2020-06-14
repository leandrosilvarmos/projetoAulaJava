package Armaduras;

public class Armadura {

	int protecao = 10;
	
	public int diminuiAtaque(int ataque) {
		if(ataque > protecao) {
			System.out.println("Armadura defendeu: " + protecao + " pontos de ataque");
		return ataque - protecao;
		}else {
			return 0;
		}
	}
	
	
}
