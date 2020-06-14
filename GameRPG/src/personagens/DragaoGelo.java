package personagens;

public class DragaoGelo extends Dragao{

	public DragaoGelo(int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Dragão Gelo");

	}
	
	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());
	}
	
}
