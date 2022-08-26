package autocorrecao;

public class Prova {
	private Pergunta[] perguntas;
	private int ultimoIndice = -1;
	private String titulo = "Prova";
	
	public Prova(int qtdPerguntas) {
		perguntas = new Pergunta[qtdPerguntas];
	}
	
	public Prova(int qtdPerguntas, String titulo) {
		this.titulo = titulo;
		perguntas = new Pergunta[qtdPerguntas];
	}
	
	public void adicionarPergunta(Pergunta novaPergunta) {
		if (ultimoIndice + 1 >= perguntas.length)
			System.out.println("Lista de perguntas esta cheia.");
		else
			perguntas[++ultimoIndice] = novaPergunta;
	}
	
	public void imprimir() {
		System.out.println(titulo);
		for (Pergunta p : perguntas)
			if (p != null)
				p.imprimir();
	}
}