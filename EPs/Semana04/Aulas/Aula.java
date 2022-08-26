package plano;

public abstract class Aula {

	private String descricao;
	
	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public abstract String getTipo();

}