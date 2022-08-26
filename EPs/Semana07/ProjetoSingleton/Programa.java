public class Programa {

	public static void main(String[] args) {
		LogSistema.getInstanciaUnica().registrar("Inicio");
		LogSistema.getInstanciaUnica().registrar("Evento1");
		LogSistema.getInstanciaUnica().registrar("Evento2");
		LogSistema.getInstanciaUnica().imprimir();
	}

}