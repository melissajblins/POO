package relatorios;

public class RelatorioErros implements Relatorio {

	@Override
	public String getTipo() {
		return "Erros";
	}
	
	@Override
	public void imprimir() {
		System.out.println("--- Erros ---");
		System.out.println("1. Erro no sistema.");
		System.out.println("2. Erro na inicializacao.");
		System.out.println("-------------");
	}

}