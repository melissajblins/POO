import java.util.Comparator;
import java.util.Random;

class ComparadorIntegerCrescente implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}
}

class ComparadorIntegerDecrescente implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return -1* (o1 - o2);
	}
}

public class Principal {

	public static <T> void ordenar(T[] v, Comparator<T> cmp) {
		for (int i = 0; i < v.length - 1; i++) {
			int indiceMenor = i;
			for (int k = i + 1; k < v.length; k++)
				//if (v[k] < v[indiceMenor])
				if (cmp.compare(v[k], v[indiceMenor]) < 0)
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
		
		Principal.<Integer>ordenar(v, new ComparadorIntegerDecrescente());
		imprimir(v);
	}
}