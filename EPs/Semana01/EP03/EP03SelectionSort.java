import java.util.Scanner;

public class EP03SelectionSort {
    
    public static void imprimir(int[] v){
		for (int i = 0; i < (v.length - 1); i++){
 			System.out.print(v[i] + " ");
		}
		System.out.println(v[v.length - 1]);
	}
	
	public static int ordenar(int[] v){
		int numeroTrocas = 0;
		for (int i = 0; i < (v.length - 1); i++){
			int indiceMenor = i;
			for (int k = (i + 1); k < v.length; k++){
				if (v[k] < v[indiceMenor]){
					indiceMenor = k;
				}
			}
			if (i != indiceMenor){
				int temporario = v[i];
				v[i] = v[indiceMenor];
				v[indiceMenor] = temporario;
				numeroTrocas++;
			}
		}
		
		return numeroTrocas;
	}

	public static void main (String[] args){
		Scanner leitor = new Scanner(System.in);
		int tamanho = leitor.nextInt();
		int[] v = new int[tamanho];
		
		for (int i = 0; i < tamanho; i++){
			v[i] = leitor.nextInt();
		}
		
		imprimir(v);
		int quantidadeTrocas = ordenar(v);
		imprimir(v);
		System.out.println("Trocas: " + quantidadeTrocas); 
	}
}
