package plano;

public class AulaRevisao extends Aula {

	public AulaRevisao() {
		super.setDescricao("Aula de revisao");
	}

	@Override
	public String getTipo() {
		return "Revisao";
	}
}