package personagens;

public class Barbaro extends Guerreiro {
	public Barbaro (int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Barbaro");

	}
	
	
	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());
	}
}
