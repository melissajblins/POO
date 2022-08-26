import java.util.Scanner;

public class EP05Lista.java {

	public static void imprimir(int[] v){
		for (int i = 0; i < (v.length - 1); i++){
 			System.out.print(v[i] + " ");
		}
		System.out.println(v[v.length - 1]);
	}	

	public static void ordenar(int[] v){
		for (int i = 0; i < v.length; i++){
		    if (v[i] == -1){
		        v[i] = 1000;
		    }
		}
		
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
			}
		}
		
		for (int i = 0; i < v.length; i++){
		    if (v[i] == 1000){
		        v[i] = -1;
		    }
		}
	}
	

	public static boolean inserir(int numero, int[] v) {
		if (v[v.length - 1] != -1) return false;
		else {
			v[v.length - 1] = numero;
			return true;
		}
	}

	public static boolean remover(int numero, int[] v){
		for (int i = 0; i < v.length; i++) {
			if (v[i] == numero){
				v[i] = -1;
				return true;
			}

		}
		return false;

	}	
	
	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		int tamanho = leitor.nextInt();
		int[] vetor = new int[tamanho];

		for (int i = 0; i < vetor.length; i++){
			vetor[i] = leitor.nextInt();
		}	
		
		int operacao = leitor.nextInt();
		int numero = leitor.nextInt();
		
	
		imprimir(vetor);
		if(operacao == 1){
			boolean operacaoResultado = inserir(numero, vetor);
			System.out.println("Inserir: " + operacaoResultado);		
		} else {
			boolean operacaoResultado = remover(numero, vetor);
			System.out.println("Remover: " + operacaoResultado);
		}
		
		ordenar(vetor);
		imprimir(vetor);		
	}
}
