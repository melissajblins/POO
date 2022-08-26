package plano;

public class Pratica extends Aula {

	public Pratica(String descricao) {
		super.setDescricao(descricao);
	}
	
	@Override
	public String getTipo() {
		return "Pratica";
	}

}