package personagens;
import combatentes.Combatente;

public class Dragao  extends Combatente {
	
	public Dragao (int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Drag�o");

	}
	
	
	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());
	}
	

	
}
