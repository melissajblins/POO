package futebol;

import java.util.Random;

public class Penalty {

	private Jogador jogador;
	
	public Penalty(Jogador jogador) {
		setStrategy(jogador);
	}
	
	public void setStrategy(Jogador jogador) {
		this.jogador = jogador;
	}
	
	public boolean cobrarPenalty() {
		Random rnd = new Random();
		
		int chute = jogador.chutar();
		int defesa = rnd.nextInt(3) + 1;
		
		System.out.println(String.format("chute=%d  defesa=%d", chute, defesa));
		
		return (chute != defesa);
	}

}