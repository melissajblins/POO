package informatica;

public class SuperComputador extends Computador {

	public void executarTeste() {
		System.out.println("Executar teste no super computador.");
	}
	
	@Override
	public String getTipo() {
		return "supercomputador";
	}

}