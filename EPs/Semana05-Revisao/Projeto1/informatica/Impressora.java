package informatica;

public class Impressora extends Maquina {

	public int qtdFolhas = 0;

	public void adicionarFolhas(int n) {
		qtdFolhas += n;
	}

	@Override
	public String getTipo() {
		return "impressora";
	}
}