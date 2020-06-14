package personagens;

public class OrcMontanha extends Orc {

	
	public OrcMontanha(int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Orc da montanha");
	}
	
	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());

	}
	
}
