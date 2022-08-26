public class DiscoVoador {
	public String cor;
	private int posicaoAtual = 0;
	
	public void darPartida() {
		System.out.println("Motor ligado! " + cor);
	}
	public void irParaFrente(int metros) {
		posicaoAtual += metros;
	}
}