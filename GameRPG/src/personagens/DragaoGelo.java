package personagens;

public class DragaoGelo extends Dragao{

	public DragaoGelo(int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Drag�o Gelo");

	}
	
	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());
	}
	
}
