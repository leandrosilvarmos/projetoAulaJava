package personagens;

import combatentes.Combatente;

public class Doende extends Combatente {
	public Doende(int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Doende do Bosque");
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());
	}
}
