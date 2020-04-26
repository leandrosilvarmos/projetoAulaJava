
public class Arqueiro extends Combatente {

	public Arqueiro(int TotalVida) {
		super(TotalVida);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void exibirNome() {
		System.out.println("Arqueiro" + this.retornarNome());
	}
}
