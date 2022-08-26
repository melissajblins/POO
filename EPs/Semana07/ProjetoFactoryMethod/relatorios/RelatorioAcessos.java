package relatorios;

public class RelatorioAcessos implements Relatorio {

	@Override
	public String getTipo() {
		return "Acessos";
	}
	
	@Override
	public void imprimir() {
		System.out.println("--- Acessos ---");
		System.out.println("1. Usuario A.");
		System.out.println("2. Usuario B.");
		System.out.println("3. Usuario C.");
		System.out.println("---------------");
	}

}