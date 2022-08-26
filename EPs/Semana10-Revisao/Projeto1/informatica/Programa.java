package informatica;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		try {
			Impressora c10 = new Impressora();
			//c10.adicionarFolhas(10);
			c10.imprimir("Teste");
			System.out.println("Apos imprimir.");
		} catch (SemPapel e) {
			System.out.println(e);
			System.out.println("Texto: " + e.getTexto());
		} finally {
			System.out.println("Fim da impressao.");
		}		
		
		Impressora c1 = new Impressora();
		SuperComputador c2 = new SuperComputador();
		Notebook c3 = new Notebook();
		Impressora c4 = new Impressora();
		
		c1.reiniciar();
		c2.reiniciar();
		c3.reiniciar();
		c2.executarTeste();
		
		
		/*Scanner leitor = new Scanner(System.in);
		String str1 = leitor.next();
		String str2 = leitor.next();
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));*/
	}

}