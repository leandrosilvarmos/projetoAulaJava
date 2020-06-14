package Armas;

import java.util.Scanner;


public class EscolherArmas {

	
	public Arma escolher() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha suas Armas:" 
							+ "\n" + "Arma Comum: Digite1" + "\n" 
							+ "Espada: Digite2" + "\n" 
							+ "Adaga: Digite3"
							+ "\n" + "Arco com flecha de Fogo: Digite 4"
							+ "\n" + "Cajado magico: Digite 5");
		
		
		int escolha = scanner.nextInt();
		
		if(escolha == 1) {
			return new Arma();
		}else if(escolha ==2) {
			return new Espada();
		}else if(escolha == 3){
			return new Adaga();
		}else if(escolha == 4) {
			return new ArcoFogo();
		}else {
			return new CajadoMagico();
		}
	}
}