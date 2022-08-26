public class Principal {
	public static void main(String[] args) {
		DiscoVoador disco1 = new DiscoVoador();
		disco1.cor = "Azul";
		//disco1.posicaoAtual = 100;
		
		DiscoVoador disco2 = new DiscoVoador();
		disco2.cor = "Verde";
		
		disco1.darPartida();
		disco2.darPartida();
	}
}