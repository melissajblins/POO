package relatorios;

public class GerenciadorRelatoriosSistemas extends GerenciadorRelatorios {

	@Override
	public Relatorio criarRelatorio(String tipo) {
		if (tipo.equals("Acessos"))
			return new RelatorioAcessos();
		else if (tipo.equals("Erros"))
			return new RelatorioErros();
		else
			return null;
	}

}