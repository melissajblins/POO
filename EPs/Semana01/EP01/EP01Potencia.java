import java.util.Scanner;

public class EP01Potencia{
	
	public static boolean verificarPotencia(int valor){
		if (valor < 1) return false;
		
		while (valor > 1){
			if (valor %2 != 0) return false;
			valor /= 2;
		}
		
		return true;
	}
	
	public static void main (String[] args){
		Scanner leitor = new Scanner(System.in);
		int tamanho = leitor.nextInt();
		int numeroPotencias = 0;
		
		for (int i = 0; i < tamanho; i++){
			int numero = leitor.nextInt();
			if(verificarPotencia(numero)) numeroPotencias++;
		}
		
		System.out.println(numeroPotencias);
		
		leitor.close();
	}
}
