import plano.Aula;
import plano.Teorica;
import plano.Pratica;
import plano.Prova;
import plano.AulaRevisao;
import plano.TemMuitaAula;
import plano.AulaNula;
import plano.RevisaoNaoPermitida;
import plano.PlanoDeAulas;

public class Programa {

	public static void main(String[] args) {
	
		try {
			PlanoDeAulas plano = new PlanoDeAulas(1);
			plano.adicionarAula(new Teorica("Introducao"));
			plano.adicionarAula(new Teorica("Programacao"));
			plano.adicionarAula(null);
			plano.adicionarAula(new Pratica("Revisao"));
			plano.adicionarAula(new Prova(3, "P2"));
			plano.imprimir();
			
			System.out.println("Media = " 
				+ plano.getFormulaMedia());
		} catch (RevisaoNaoPermitida e) {
			System.out.println("Erro da aula de revisao: " + e.toString());			
		} catch (TemMuitaAula e) {
			System.out.println("Erro do limite de aulas: " + e.toString());
			System.out.println("Limite: " + e.getLimiteAulas());
			System.out.println("Aula: " + e.getNovaAula().getDescricao());
		} catch (AulaNula e) {
			System.out.println("Erro AulaNula: " + e.toString());
		} catch (Exception e) {
			System.out.println("Erro: " + e.toString());
		}
	}

}