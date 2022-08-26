import java.util.Scanner;

public class EP04CampoMinado {
	
public static boolean validaCampo(int[][] matriz, int linha, int coluna){
		if (linha >= 0 && linha < (matriz.length)) {
			if (coluna >= 0 && coluna < (matriz[0].length)){
				return true;
			}
		}
		return false;
	}

	public static boolean existeBomba(int[][] matriz, int linha, int coluna){
		if(validaCampo(matriz, linha, coluna)){
			if(matriz[linha][coluna] == 1) return true;
			else return false;
		}
		return false;	

	}

	public static int contaBombas(int[][] matriz, int linhaBomba, int colunaBomba){
		int quantidadeBombas = 0;			
			for (int i = (linhaBomba - 1); i <= (linhaBomba + 1); i++){
				for (int j = (colunaBomba - 1); j <= (colunaBomba + 1); j++){
					if(existeBomba(matriz, i, j)) quantidadeBombas++;
				}
			}

		return quantidadeBombas;
	
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
		
		int linhaBomba = leitor.nextInt();
		int colunaBomba = leitor.nextInt();
		
		int quantidadeBombas = contaBombas(matriz, linhaBomba, colunaBomba);
		
		System.out.println(quantidadeBombas);
	
	}

}
