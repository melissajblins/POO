package espaco;

public class DiscoVoador {
	public String cor;
	private int posicaoAtual = 0;
	boolean estacionado;
	
	public void darPartida() {
		System.out.println("Motor ligado! " + cor);
	}
	public void irParaFrente(int metros) {
		posicaoAtual += metros;
	}
}