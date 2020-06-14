package personagens;
import combatentes.Combatente;

public class Dragao  extends Combatente {
	
	public Dragao (int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Dragão");

	}
	
	
	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());
	}
	

	
}
