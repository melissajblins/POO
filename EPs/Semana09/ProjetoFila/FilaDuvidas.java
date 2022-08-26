public class FilaDuvidas<T extends Duvida> extends Fila<T> {

	private String disciplina;
	
	public FilaDuvidas(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public String getDisciplina() {
		return this.disciplina;
	}

}