package personagens;

import combatentes.Combatente;

public class Mago extends Combatente {

	public Mago(int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Mago");
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());
	}
	
}
