package Rpg;



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Armas.Arma;
import Armas.Armadura;
import Armas.Escudo;
import Armas.Espada;
import combatentes.Batalha;
import combatentes.Combatente;
import combatentes.EscolherCombatente;

public class Game {

	public static void main(String[] args) {
		
		
		EscolherCombatente escolher = new EscolherCombatente();
		Arma arma2 = new Arma();
		Arma espada =  new Espada();
		Armadura armadura1 = new Armadura();
		Armadura escudo =  new Escudo();
		Combatente c = escolher.escolher();
		Combatente a = escolher.escolher();
		a.equiparArmas(arma2);
		c.equipeArmadura(armadura1);
		a.equipeArmadura(escudo);
		c.equiparArmas(espada);
		
		
		
		Batalha b = new Batalha (c , a);
		
		
		b.batalhar();
		
		
		Combatente vencedor = b.vencedor();
		System.out.println("O vencedor da partida é: " + vencedor.retornarNome());
		
				
	}

}
