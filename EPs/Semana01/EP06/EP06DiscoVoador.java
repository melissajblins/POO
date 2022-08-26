import java.util.Scanner;

public class EP06DiscoVoador{
	
	public static void imprimeMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < (matriz[0].length); j++){
				if (j == matriz[0].length - 1)
				    System.out.print(matriz[i][j]);
				else
				    System.out.print(matriz[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

	public static boolean validaCampo(int[][] matriz, int linha, int coluna){
		if (linha < matriz.length && coluna < matriz[0].length)
			return true;
		return false;	
	}	

	public static boolean segundaLinhaEhMenor(int[][] matriz, int linha){

		for (int j = 0; j < matriz[0].length; j++){
			if (validaCampo(matriz, linha + 1, j) && matriz[linha][j] > matriz[linha + 1][j])
				return true;
		}
		return false;
	}

	public static void trocaLinhas(int[][] matriz, int linha){
		int[] vetorLinha = new int[matriz[0].length];

		for (int j = 0; j < matriz[0].length; j++){
			vetorLinha[j] = matriz[linha][j];
		}		

		for (int j = 0; j < matriz[0].length; j++){
			matriz[linha][j] = matriz[linha + 1][j];
		}	

		for (int j = 0; j < matriz[0].length; j++){
			matriz[linha + 1][j] = vetorLinha[j];
		}
	
	}

	public static boolean segundaColunaEhMenor(int[][] matriz, int coluna){

		for (int i = 0; i < matriz.length; i++){
			if (validaCampo(matriz, i, coluna + 1) && matriz[i][coluna] > matriz[i][coluna + 1])
				return true;
		}
		return false;
	}

	public static void trocaColunas(int[][] matriz, int coluna){
		int[] vetorColuna = new int[matriz.length];

		for (int i = 0; i < matriz.length; i++){
			vetorColuna[i] = matriz[i][coluna];
		}		

		for (int i = 0; i < matriz.length; i++){
			matriz[i][coluna] = matriz[i][coluna + 1];
		}	

		for (int i = 0; i < matriz.length; i++){
			matriz[i][coluna + 1] = vetorColuna[i];
		}
	
	}


	public static void ordenaLinhas(int[][] matriz){
		boolean flagMatrizOrdenada = false;		
		
		int contaValidacao = 0;
		
		while(flagMatrizOrdenada == false){
			
			for (int i = 0; i < matriz.length; i++){
				if (validaCampo(matriz, i + 1, 0) && matriz[i][0] > matriz[i + 1][0])
					trocaLinhas(matriz, i);
				else if (validaCampo(matriz, i + 1, 0) && matriz[i][0] == matriz[i + 1][0]){
					if (segundaLinhaEhMenor(matriz, i))
						trocaLinhas(matriz, i);
				}
			}
			
			contaValidacao++;
			
			if (contaValidacao == matriz.length)
			    flagMatrizOrdenada = true;
		}
	}	

	public static void ordenaColunas(int[][] matriz){
		boolean flagMatrizOrdenada = false;		
		
		int contaValidacao = 0;
		
		while(flagMatrizOrdenada == false){
			
			for (int j = 0; j < matriz.length; j++){
				if (validaCampo(matriz, 0, j + 1) && matriz[0][j] > matriz[0][j + 1]){
					trocaColunas(matriz, j);
				} else if (validaCampo(matriz, 0, j + 1) && matriz[0][j] == matriz[0][j + 1]){
					if (segundaColunaEhMenor(matriz, j)){
						trocaColunas(matriz, j);
					}
				}
			}
			
			contaValidacao++;
			
			if (contaValidacao == matriz[0].length){
			    flagMatrizOrdenada = true;
			}
		}
	}

	public static void main(String[] args){
			
		Scanner leitor = new Scanner(System.in);
		int numeroLinhas = leitor.nextInt();
		int numeroColunas = leitor.nextInt();
		int[][] matriz = new int[numeroLinhas][numeroColunas];

		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[0].length; j++){
				matriz[i][j] = leitor.nextInt();			
			}
		}		
			
		ordenaLinhas(matriz);
		imprimeMatriz(matriz);
		System.out.print("\n");
		
		ordenaColunas(matriz);	
		imprimeMatriz(matriz);
	}
}
