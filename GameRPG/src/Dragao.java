
public class Dragao  extends Combatente{
	
	public Dragao (int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Drag�o branco");

	}
	
	
	@Override
	public void exibirNome() {
		System.out.println("Dragao : " + this.retornarNome());
	}
	
	
	
}
