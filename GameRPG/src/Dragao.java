
public class Dragao  extends Combatente{
	
	public Dragao (int TotalVida) {
		super(TotalVida);
	}
	
	
	@Override
	public void exibirNome() {
		System.out.println("Dragao : " + this.retornarNome());
	}
	
	
	
}
