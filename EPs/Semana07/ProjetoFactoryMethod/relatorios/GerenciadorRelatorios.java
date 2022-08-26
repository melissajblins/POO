package relatorios;

public abstract class GerenciadorRelatorios {

	private Relatorio[] relatorios = new Relatorio[100];
	private int ultimoIndice = -1;

	public void gerarRelatorio(String tipo) {
		Relatorio r = criarRelatorio(tipo);
		relatorios[++ultimoIndice] = r;
		r.imprimir();
	}
	
	public void imprimirListaRelatorios() {
		for (int i = 0; i <= ultimoIndice; i++)
			System.out.println(String.format("%d. %s",
				i+1, relatorios[i].getTipo()));
	}
	
	public abstract Relatorio criarRelatorio(String tipo);
}