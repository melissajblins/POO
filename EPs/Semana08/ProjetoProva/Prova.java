public class Prova implements AutoCloseable {
	private String nome;

	public Prova(String nome) {
		this.nome = nome;
		System.out.println("Iniciou prova: " + nome);
	}
	
	public void responderQuestao(int n) {
		System.out.println("Responder questao " + n);
		if (n == 2)
			throw new RuntimeException("Erro na questao 2");
	}
	
	@Override
	public void close() {
		System.out.println("Encerrar prova: " + nome);
	}

}