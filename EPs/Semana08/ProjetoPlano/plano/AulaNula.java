package plano;

public class AulaNula extends RuntimeException {

	public AulaNula() {
		super("Foi passada uma aula nula.");
	}

}