package Rpg;



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Armaduras.Armadura;
import Armaduras.EscolherArmaduras;
import Armaduras.Escudo;
import Armas.Arma;
import Armas.EscolherArmas;
import Armas.Espada;
import combatentes.Batalha;
import combatentes.Combatente;
import combatentes.EscolherCombatente;

public class Game {

	public static void main(String[] args) {
		
		
		EscolherCombatente escolher = new EscolherCombatente();
		EscolherArmas escolhearma = new EscolherArmas();
		EscolherArmaduras escolherarmadura = new EscolherArmaduras();
		
		Arma arma1 = escolhearma.escolher();
		Arma arma2 = escolhearma.escolher();
		
		Armadura armadura1 = escolherarmadura.escolher();
		Armadura armadura2 = escolherarmadura.escolher();
		
		//Arma arma2 = new Arma();
		//Arma espada =  new Espada();
		//Armadura armadura1 = new Armadura();
		//Armadura escudo =  new Escudo();
		
		
		Combatente c = escolher.escolher();
		Combatente a = escolher.escolher();
		
		a.equiparArmas(arma1);
		c.equipeArmadura(armadura1);
		a.equipeArmadura(armadura2);
		c.equiparArmas(arma2);
		
		
		
		Batalha b = new Batalha (c , a);
		
		b.batalhar();
		
		
		Combatente vencedor = b.vencedor();
		System.out.println("\n" + "O vencedor da partida é: " + vencedor.retornarNome());
		
				
	}

}
