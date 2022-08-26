import java.util.Scanner;

public class EP02SerieGregory {
	
	public static int retornaPotencia(int expoente){
		if (expoente == 0){
			return 1;
		} else if (expoente % 2 == 0){
			return 1;
		} else {
			return -1;
		} 
	}

	public static void main (String[] args){
		Scanner leitor = new Scanner(System.in);
		int tamanhoSerie = leitor.nextInt();
		double pi = 0;
		double numero = 0;
		
		for (int i = 0; i < tamanhoSerie; i++){
			double numerador = retornaPotencia(i); 
			numero = numerador/(2*i + 1);
			pi += numero;
			if (i < 50) {
				System.out.print(String.format("%.5f ", numero));
			}
		}
		
		System.out.println(String.format("\n%.5f", (pi*4)));
		
	}
}
