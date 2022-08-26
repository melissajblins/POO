import java.util.Random;

public class Principal {

	public static <T extends Comparable<T>> void ordenar(T[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			int indiceMenor = i;
			for (int k = i + 1; k < v.length; k++)
				//if (v[k] < v[indiceMenor])
				if (v[k].compareTo(v[indiceMenor]) < 0)
					indiceMenor = k;
			
			if (indiceMenor != i) {
				T tmp = v[i];
				v[i] = v[indiceMenor];
				v[indiceMenor] = tmp;
			}
		}
			
	}
	
	public static void imprimir(Object[] v) {
		for (Object e : v)
			System.out.print(e + " ");
		System.out.println();
	}

	public static void main(String [] args) {
		Random rnd = new Random();
		
		Integer[] v = new Integer[10];
		for (int i = 0; i < v.length; i++)
			v[i] = rnd.nextInt(100) + 1;
		
		imprimir(v);
		
		Principal.<Integer>ordenar(v);
		imprimir(v);
		
		
		Pedido[] v2 = new Pedido[10];
		for (int i = 0; i < v2.length; i++)
			v2[i] = new Pedido(
							rnd.nextInt(100) + 1, 
							"Endereco");
							
		imprimir(v2);
		
		Principal.<Pedido>ordenar(v2);
		imprimir(v2);
	}
}