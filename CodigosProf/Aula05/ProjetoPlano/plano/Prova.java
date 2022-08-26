package plano;

public class Prova extends Aula implements Avaliacao {

	private double peso;
	
	public Prova(double peso, String descricao) {
		super.setDescricao(descricao);
		this.peso = peso;
	}

	@Override
	public String getTipo() {
		return "Prova";
	}
	
	@Override
	public double getPeso() {
		return this.peso;		
	}

}