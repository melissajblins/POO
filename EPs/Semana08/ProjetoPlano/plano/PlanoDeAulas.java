package plano;

public class PlanoDeAulas {

	private Aula[] aulas;
	private int indiceUltimaAula = -1;
	
	public PlanoDeAulas(int qtdAulas) {
		this.aulas = new Aula[qtdAulas];
	}
	
	public void adicionarAula(Aula novaAula) 
		throws TemMuitaAula, RevisaoNaoPermitida {
			if (novaAula == null)
				throw new AulaNula();
			if (indiceUltimaAula + 1 >= aulas.length) {
				throw new TemMuitaAula(aulas.length, novaAula);
			} if (novaAula instanceof AulaRevisao)
				throw new RevisaoNaoPermitida();
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
				formula += 
					((Avaliacao)a).getPeso()
					+ " x " + a.getDescricao();
			}
		}
		return formula;
	}

}