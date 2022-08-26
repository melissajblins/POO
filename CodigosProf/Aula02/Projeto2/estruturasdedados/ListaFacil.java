package estruturasdedados;

public class ListaFacil {
	private int[] itens;
	private int indiceUltimo = -1;
	
	public void iniciaLista(int tamanhoMax) {
		this.itens = new int[tamanhoMax];
	}

	public void adicionarItem(int novoItem) {
		if (indiceUltimo + 1 >= itens.length)
			System.out.println("Lista cheia.");
		else
			itens[++indiceUltimo] = novoItem;
	}
	
	public Integer lerItem(int indice) {
		if (indice < 0 || indice > indiceUltimo) {
			System.out.println("Indice invalido.");
			return null;
		} else
			return itens[indice];
	}
}