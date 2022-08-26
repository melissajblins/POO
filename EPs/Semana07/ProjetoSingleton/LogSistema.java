public class LogSistema {

	private static LogSistema instanciaUnica = null;
	private String[] registros = new String[100];
	private int ultimoIndice = -1;
	
	private LogSistema() {
	}
	
	public static LogSistema getInstanciaUnica() {
		if (instanciaUnica == null)
			instanciaUnica = new LogSistema();
		return instanciaUnica;
	}
	
	public void registrar(String evento) {
		registros[++ultimoIndice] = evento;
	}
	
	public void imprimir() {
		for (int i = 0; i <= ultimoIndice; i++)
			System.out.println(registros[i]);
	}

}