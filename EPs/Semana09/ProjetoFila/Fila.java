import java.util.ArrayList;

public class Fila<T> {

	private ArrayList<T> itens = new ArrayList<T>();

	public void enfileirar(T item) {
		itens.add(item);
	}
	
	public T desenfileirar() {
		if (itens.size() == 0)
			return null;
		
		T item = itens.get(0);
		itens.remove(0);
		return item;
	}

}