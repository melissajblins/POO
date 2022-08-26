package universidade;

public class Curso {
	private Disciplina[] listaDisciplinas;
	private String nome;
	private int indiceUltimo = -1;

	public void setNome(String nomeCurso) {
		nome = nomeCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setMaxDisciplinas(int maxDisciplinas) {
		listaDisciplinas = new Disciplina[maxDisciplinas];
	}

	public boolean adicionarDisciplina(Disciplina d) {
		if (indiceUltimo + 1 >= listaDisciplinas.length)
			return false;
		else {
			listaDisciplinas[++indiceUltimo] = d;
			return true;
		}
	}

	public String[] getListaDisciplinasStr() {
		if (indiceUltimo < 0)
			return null;
		String[] listaStr = new String[indiceUltimo + 1];
		for (int i = 0; i <= indiceUltimo; i++)
			listaStr[i] = String.format("%s: %d", 
				listaDisciplinas[i].getNome(),
				listaDisciplinas[i].getQtdCreditos());
		return listaStr;
	}
}