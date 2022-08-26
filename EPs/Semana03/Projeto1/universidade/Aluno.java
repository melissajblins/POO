package universidade;

public class Aluno extends Pessoa {

	private String curso;
	private int creditosCursados = 0;
	
	public Aluno(String curso) {
		this.curso = curso;
	}
	
	public void adicionarCreditos(int creditos) {
		creditosCursados += creditos;
	}
	
	public void imprimir() {
		System.out.println(curso);
		System.out.println(creditosCursados);
	}
}