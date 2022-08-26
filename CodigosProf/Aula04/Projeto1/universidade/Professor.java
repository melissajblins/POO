package universidade;

public class Professor extends Pessoa {
	private String sala;

	public void setSala(String sala) {
		this.sala = sala;
	}
	
	public String getSala() {
		return this.sala;
	}
	
	@Override
	public String getNome() {
		return "Prof. " + super.getNome();
	}
	
	@Override
	public String toString() {
		return String.format("[PROFESSOR: %s]", getNome());
	}
}