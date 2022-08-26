package plano;

public class PlanoDeAulas {

	private Aula[] aulas;
	private int indiceUltimaAula = -1;
	
	public PlanoDeAulas(int qtdAulas) {
		this.aulas = new Aula[qtdAulas];
	}
	
	public void adicionarAula(Aula novaAula) 
		throws Exception {
			if (indiceUltimaAula + 1 >= aulas.length)
				throw new Exception("Lista de aulas cheia.");
			aulas[++indiceUltimaAula] = novaAula;
	}
	
	public void imprimir() {
		for (int i = 0; i <= indiceUltimaAula; i++)
			System.out.println(
				String.format("[%s] %s",
					aulas[i].getTipo(),
					aulas[i].getDescricao())
				);
	}
	
	public String getFormulaMedia() {
		String formula = "";
		for (Aula a : aulas) {
			if (a != null && a instanceof Avaliacao) {
				if (!formula.equals(""))
					formula += " + ";
				
				double peso = ((Avaliacao)a).getPeso();
				String data = ((Avaliacao)a).getDataEntrega();
				String descricao = a.getDescricao();
				
				formula += String.format("%.1f x %s(%s)",
				    peso, descricao, data);
			}
		}
		return formula;
	}

}