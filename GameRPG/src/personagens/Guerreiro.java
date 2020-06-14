package personagens;

import combatentes.Combatente;

public class Guerreiro extends Combatente {
	public Guerreiro (int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Guerreiro");

	}
	
	
	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());
	}
}
