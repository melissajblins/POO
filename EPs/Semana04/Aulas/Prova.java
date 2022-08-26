package plano;

public class Prova extends Aula implements Avaliacao {

	private double peso;
	private String dataEntrega;
	
	public Prova(double peso, String descricao, String dataEntrega) {
		super.setDescricao(descricao);
		this.peso = peso;
		this.dataEntrega = dataEntrega;
	}

	@Override
	public String getTipo() {
		return "Prova";
	}
	
	@Override
	public double getPeso() {
		return this.peso;		
	}
	
	@Override
	public String getDataEntrega() {
	    return this.dataEntrega;
	}

}