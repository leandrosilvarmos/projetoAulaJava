package personagens;


public class Arqueiro extends Humano  {

	public Arqueiro(int TotalVida) {
		super(TotalVida);
		super.atribuirNome("Arqueiro do castelo");
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void exibirNome() {
		System.out.println("Arqueiro" + this.retornarNome());
	}
	
	
	
	
	
	
	
}
