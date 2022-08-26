package autocorrecao;

public class Prova implements Cloneable {
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
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void adicionarPergunta(Pergunta novaPergunta) throws CloneNotSupportedException {
		if (ultimoIndice + 1 >= perguntas.length)
			System.out.println("Lista de perguntas esta cheia.");
		else
			perguntas[++ultimoIndice] = novaPergunta.clone();
	}
	
	public void imprimir() {
		System.out.println(titulo);
		for (Pergunta p : perguntas)
			if (p != null)
				p.imprimir();
	}
	
	@Override
	public Prova clone() throws CloneNotSupportedException {
		Prova novaInstancia = (Prova) super.clone();
		
		novaInstancia.perguntas = perguntas.clone();
		for (int i = 0; i <= ultimoIndice; i++)
			novaInstancia.perguntas[i] = perguntas[i].clone();
		
		return novaInstancia;
	}
}