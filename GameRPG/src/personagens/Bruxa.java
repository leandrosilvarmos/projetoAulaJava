package personagens;

public class Bruxa extends Humano {

	public Bruxa(int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Bruxa do Castelo");
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());
	}
}
