public class Aluno {
	private static int qtdAlunos = 0;
	
	public Aluno() {
		qtdAlunos++;
	}
	
	public static int getQtdAlunos() {
		return qtdAlunos;
	}
	
	public static void main(String[] args) {
		System.out.println("Classe Aluno.");
	}
}