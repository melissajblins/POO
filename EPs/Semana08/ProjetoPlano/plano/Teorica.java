package plano;

public class Teorica extends Aula {

	public Teorica(String descricao) {
		super.setDescricao(descricao);
	}
	
	@Override
	public String getTipo() {
		return "Teorica";
	}

}