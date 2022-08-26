import plano.Aula;
import plano.Teorica;
import plano.Pratica;
import plano.Prova;
import plano.PlanoDeAulas;

public class Programa {

	public static void main(String[] args) {
	
		try {
			PlanoDeAulas plano = new PlanoDeAulas(5);
			plano.adicionarAula(new Teorica("Introducao"));
			plano.adicionarAula(new Teorica("Programacao"));
			plano.adicionarAula(new Prova(2, "P1"));
			plano.adicionarAula(new Pratica("Revisao"));
			plano.adicionarAula(new Prova(3, "P2"));
			plano.imprimir();
			
			System.out.println("Media = " 
				+ plano.getFormulaMedia());
		} catch(Exception e) {
			System.out.println("Erro: " + e.toString());
		}
	}

}