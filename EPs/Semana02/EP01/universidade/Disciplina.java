package universidade;

public class Disciplina{
	private String nome;
	private int qtdCreditos;

	public void setNome(String nomeDisciplina){
		this.nome = nomeDisciplina;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setQtdCreditos(int qtdCreditos){
		this.qtdCreditos = qtdCreditos;
	}
	
	public int getQtdCreditos(){
		return this.qtdCreditos;
	}
}