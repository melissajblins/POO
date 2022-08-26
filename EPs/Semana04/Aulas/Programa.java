import plano.Aula;
import plano.Teorica;
import plano.Pratica;
import plano.Prova;
import plano.Projeto;
import plano.PlanoDeAulas;

public class Programa {

	public static void main(String[] args) {
		try {
			PlanoDeAulas plano = new PlanoDeAulas(10);
			plano.adicionarAula(new Teorica("Introducao"));
			plano.adicionarAula(new Teorica("Programacao"));
			plano.adicionarAula(new Prova(3, "P1", "01/02"));
			plano.adicionarAula(new Pratica("Revisao"));
			plano.adicionarAula(new Prova(3, "P2", "03/04"));
			plano.adicionarAula(new Projeto(4, "Projeto final", "05/06"));
			plano.imprimir();
			
			System.out.println("\nMedia = " + plano.getFormulaMedia());
		} catch(Exception e) {
			System.out.println("Erro: " + e.toString());
		}
	}

}