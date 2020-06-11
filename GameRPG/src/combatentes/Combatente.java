package combatentes;
import java.util.Random;

import Armas.Arma;
import Armas.Armadura;

public abstract class  Combatente  {


	private int TotalVida ;
	private int Defesa ; 
	private String Nome;
	private Arma arma;
	private Armadura armadura;
	
	public Combatente (int TotalVida) {
		this.TotalVida = TotalVida;
		
	}
	
public void receberAtaque(int quantidaAtaque ) {
	if (armadura == null ) {
	this.TotalVida = this.TotalVida - quantidaAtaque;
	}else {
		this.TotalVida = this.TotalVida - armadura.diminuiAtaque(quantidaAtaque);
	}
	
}


public int atacar() {
	Random rand = new Random(); 
	int ataque = rand.nextInt(10);
	if(arma == null) {
		return ataque;
	}else {
		return arma.aumentaAtaque(ataque);
	}
}


public void atribuirNome(String nome) {
	this.Nome = nome;
}


public  void exibirNome () {
	System.out.println("Nome: " + this.Nome);
}


public String retornarNome () {
	return this.Nome;
}



public int getVida() {
	return TotalVida;
}
	
	public boolean estaVivo() {
		return TotalVida > 0;
	}

	public boolean estaMorto() {
		return TotalVida <= 0;
	}
	
	
	
	public void equiparArmas(Arma arma) {
		this.arma = arma;
	}
	
	public void equipeArmadura(Armadura armadura) {
		this.armadura = armadura;
	}
	
	
}



