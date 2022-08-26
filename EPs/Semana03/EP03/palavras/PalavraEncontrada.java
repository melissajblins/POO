package palavras;

public class PalavraEncontrada{
	String palavra;
	int[] posicao = new int[2];
	int tipo;
	int direcao;
	
	public String getPalavra(){
		return this.palavra;
	}

	public int[] getPosicao(){
		return this.posicao;
	}

	public int getTipo(){
		return this.tipo;
	}

	public int getDirecao(){
		return this.direcao;
	}
}
