package personagens;

public class MagoDruida extends Mago {

	public MagoDruida(int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Mago Druida - Feiticeiro");
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void exibirNome() {
		System.out.println(this.retornarNome());
	}
}
