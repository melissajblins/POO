package plano;

public class Projeto extends Aula implements Avaliacao {

	private double peso;
	private String dataEntrega;
	
	public Projeto(double peso, String descricao, String dataEntrega) {
		super.setDescricao(descricao);
		this.peso = peso;
		this.dataEntrega = dataEntrega;
	}

	@Override
	public String getTipo() {
		return "Projeto";
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