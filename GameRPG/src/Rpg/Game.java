package Rpg;



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Armaduras.Armadura;
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
		
		Arma arma1 = escolhearma.escolher();
		Arma arma2 = escolhearma.escolher();
		
		//Arma arma2 = new Arma();
		//Arma espada =  new Espada();
		Armadura armadura1 = new Armadura();
		Armadura escudo =  new Escudo();
		Combatente c = escolher.escolher();
		Combatente a = escolher.escolher();
		a.equiparArmas(arma1);
		c.equipeArmadura(armadura1);
		a.equipeArmadura(escudo);
		c.equiparArmas(arma2);
		
		
		
		Batalha b = new Batalha (c , a);
		
		b.batalhar();
		
		
		Combatente vencedor = b.vencedor();
		System.out.println("O vencedor da partida é: " + vencedor.retornarNome());
		
				
	}

}
