import java.util.Random;

public class Combatente {


	private int TotalVida ;
	private int Defesa ; 
	private String Nome;
	
	public Combatente (int TotalVida) {
		this.TotalVida = TotalVida;
		
	}
	
public void receberAtaque(int quantidaAtaque ) {
	this.TotalVida = this.TotalVida - quantidaAtaque;
	
}



public void atribuirNome(String nome) {
	this.Nome = nome;
}


public  void exibirNome () {
	System.out.println("Nome: " + this.Nome);
}


protected String retornarNome () {
	return this.Nome;
}



public int getVida() {
	return TotalVida;
}
	
	public boolean estaVivo() {
		return TotalVida > 0;
	}

	public boolean estaMorto() {
		return TotalVida == 0;
	}
	
	
}
