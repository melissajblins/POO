package relatorios;

public class Programa {

	public static void main(String[] args) {
		GerenciadorRelatoriosSistemas r1 = new GerenciadorRelatoriosSistemas();
		r1.gerarRelatorio("Erros");
		r1.gerarRelatorio("Acessos");
		r1.imprimirListaRelatorios();
	}

}