package personagens;

public class Lobisomen extends Humano {

	public Lobisomen(int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Lobisomen");
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());
	}
}
