
public class Orc extends Combatente {

	
	public Orc(int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Orc da montanha");
	}
	
	@Override
	public void exibirNome() {
		System.out.println("Orc" + this.retornarNome());

	}
}
