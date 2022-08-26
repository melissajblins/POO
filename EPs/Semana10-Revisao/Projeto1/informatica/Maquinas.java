package informatica;

class Maquina {
	public String fabricante;
	
	public void reiniciar() {
		System.out.println("Reiniciar maquina.");
	}
}

class SemPapel extends Exception {
	private String texto;
	
	public SemPapel(String texto) {
		super("Sem papel");
		this.texto = texto;
	}
	
	public String getTexto() {
		return this.texto;
	}
}

class Impressora extends Maquina {
	
	public int qtdFolhas = 0;
	
	public void adicionarFolhas(int n) {
		qtdFolhas += n;
	}
	
	public void imprimir(String texto) throws SemPapel {
		if (qtdFolhas == 0)
			throw new SemPapel(texto);
		System.out.println("Imprimir.");
	}
}

class Computador extends Maquina implements Cloneable {
	private int[] v = new int[3];
	private double preco;
	
	public Computador(int nProcessadores) {

	}
	
	public void reiniciar() {
		System.out.println("Reiniciar computador.");
	}
	
	@Override
	public Computador clone() throws CloneNotSupportedException {
		Computador c1 = (Computador) super.clone();
		c1.v = this.v.clone();
		return c1;
	}
}

class Notebook extends Computador {
	int nivelBateria = 0;
	
	public Notebook() {
		super(1);
	}
	
	public void carregarBateria(int tempo) {
		this.nivelBateria += tempo;
	}
}

class SuperComputador extends Computador {
	public SuperComputador() {
		super(10);
	}
	
	public void executarTeste() {
		System.out.println("Executar teste (1).");
		reiniciar();
		System.out.println("Executar teste (2).");
	}
}