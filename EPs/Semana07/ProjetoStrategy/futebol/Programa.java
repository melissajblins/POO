package futebol;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int tipo = leitor.nextInt();
		Jogador estrategia = null;
		switch (tipo) {
			case 1: {
				estrategia = new JogadorEstrategiaA();
				break;
			}
			case 2: {
				estrategia = new JogadorEstrategiaB();
				break;
			}
		}
		
		int gols = 0;
		int defesas = 0;
		Penalty p = new Penalty(estrategia);
		for (int i = 0; i < 5; i++) {
			if (p.cobrarPenalty())
				gols++;
			else
				defesas++;
		}
		
		System.out.println(String.format("Gols=%d  Defesa=%d", gols, defesas));
			
	}

}