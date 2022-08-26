package universidade;

public class Pessoa {
	protected String nome;

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		return String.format("[PESSOA: %s]", nome);
	}
}
