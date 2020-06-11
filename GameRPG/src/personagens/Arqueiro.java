package personagens;

import combatentes.Combatente;

public class Arqueiro extends Combatente  {

	public Arqueiro(int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Arqueiro do castelo");
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void exibirNome() {
		System.out.println("Arqueiro" + this.retornarNome());
	}
	
	
	
	
	
	
	
}
