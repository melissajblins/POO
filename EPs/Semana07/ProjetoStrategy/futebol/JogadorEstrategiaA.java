package futebol;

import java.util.Random;

public class JogadorEstrategiaA implements Jogador {

	@Override
	public int chutar() {
		Random rnd = new Random();
		return rnd.nextInt(3) + 1;
	}

}