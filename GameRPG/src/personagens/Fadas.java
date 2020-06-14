package personagens;

import combatentes.Combatente;

public class Fadas extends Combatente {

	public Fadas(int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Fada do Bosque");
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());
	}
	
}
