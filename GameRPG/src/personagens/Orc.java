package personagens;
import combatentes.Combatente;

public class Orc extends Combatente  {

	
	public Orc(int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Orc");
	}
	
	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());

	}
	
	

}
