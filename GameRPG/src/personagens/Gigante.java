package personagens;

public class Gigante extends Guerreiro{
	public Gigante (int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Gigante do Norte");

	}
	
	
	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());
	}
}
