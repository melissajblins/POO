package plano;

public class TemMuitaAula extends Exception {

	private int limiteAulas;
	private Aula novaAula;

	public TemMuitaAula(
		int limiteAulas, 
		Aula novaAula) {
			super("Lista de aulas cheia.");
			this.limiteAulas = limiteAulas;
			this.novaAula = novaAula;
	}
	
	public int getLimiteAulas() {
		return limiteAulas;
	}

	public Aula getNovaAula() {
		return novaAula;
	}
}