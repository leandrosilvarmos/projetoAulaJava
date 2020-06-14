package personagens;

public class DragaoBranco extends Dragao{

	public DragaoBranco(int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Dragão branco");

	}
	
	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());
	}
	

}
