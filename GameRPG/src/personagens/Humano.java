package personagens;

import combatentes.Combatente;

public class Humano extends Combatente {

	public Humano(int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Humano");
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());
	}
	
}
