package autocorrecao;

public class Pergunta {
	
	private String textoPergunta;
	private Alternativa[] alternativas;
	private int ultimoIndice = -1;
	private int indiceCorreta = -1;
	
	public Pergunta(int qtdAlternativas, String textoPergunta) {
		this.alternativas = new Alternativa[qtdAlternativas];
		this.textoPergunta = textoPergunta;
	}

	public void adicionarAlternativa(String novaAlternativa) {
		adicionarAlternativa(false, novaAlternativa);
	}
	
	public void adicionarAlternativa(boolean correta, String novaAlternativa) {
		adicionarAlternativa(correta, new Alternativa(novaAlternativa));
	}
	
	public void adicionarAlternativa(boolean correta, Alternativa novaAlternativa) {
		if (ultimoIndice + 1 >= alternativas.length)
			System.out.println("Lista de alternativas esta cheia.");
		else {
			if (correta) {
				if (indiceCorreta >= 0) {
					System.out.println("Ja existe outra alternativa correta.");
					return;
				}
				indiceCorreta = ultimoIndice + 1;
			}
			alternativas[++ultimoIndice] = novaAlternativa;
		}
	}
	
	public void imprimir() {
		System.out.println("------------------------");
		System.out.println("Pergunta: " + textoPergunta);
		for (Alternativa a : alternativas)
			System.out.println("- " + a.getTexto());
	}
	
}