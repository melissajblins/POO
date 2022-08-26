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

	public void adicionarAlternativa(String novaAlternativa) throws Exception {
		adicionarAlternativa(false, novaAlternativa);
	}
	
	public void adicionarAlternativa(boolean correta, String novaAlternativa) throws Exception {
		adicionarAlternativa(correta, new Alternativa(novaAlternativa));
	}
	
	public void adicionarAlternativa(boolean correta, Alternativa novaAlternativa) throws Exception {
		if (ultimoIndice + 1 >= alternativas.length)
			//System.out.println("Lista de alternativas esta cheia.");
			throw new Exception("Lista de alternativas esta cheia.");
		else {
			if (correta) {
				if (indiceCorreta >= 0) {
					//System.out.println("Ja existe outra alternativa correta.");
					throw new Exception("Ja existe outra alternativa correta.");
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
