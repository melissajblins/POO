import autocorrecao.Alternativa;
import autocorrecao.Pergunta;
import autocorrecao.Prova;

public class Principal {

	public static void main(String[] args) {
		try {
			Pergunta q1 = new Pergunta(2, "Quanto eh 10 + 10?");
			q1.adicionarAlternativa(true, new Alternativa("20"));
			q1.adicionarAlternativa(false, new Alternativa("200"));
			q1.adicionarAlternativa(false, new Alternativa("2000"));
		
			Pergunta q2 = new Pergunta(3, "Quanto eh 10 x 10?");
			q2.adicionarAlternativa(true, "100");
			q2.adicionarAlternativa("200");
			q2.adicionarAlternativa(false, new Alternativa("20"));
		
			Prova p1 = new Prova(1, "P1");
			p1.adicionarPergunta(q1);
			p1.adicionarPergunta(q2);
		
			p1.imprimir();
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
		System.out.println("Fim do programa");
	}

}
