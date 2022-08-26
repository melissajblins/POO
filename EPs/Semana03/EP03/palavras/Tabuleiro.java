package palavras;
	
public class Tabuleiro{
	private char[][] tabuleiro;
	
	public Tabuleiro(char[][] matriz){
		this.tabuleiro = new char[matriz.length][matriz[0].length];
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[0].length; j++){
				tabuleiro[i][j] = matriz[i][j];			
			}
		}	
	}

	public Tabuleiro(int qtdLinhas, int qtdColunas, char[] dadosMatriz){
		int contadorPosicao = 0;	
		this.tabuleiro = new char[qtdLinhas][qtdColunas];
		for (int i = 0; i < qtdLinhas; i++){
			for (int j = 0; j < qtdColunas; j++){
				tabuleiro[i][j] = dadosMatriz[contadorPosicao++];
			}
		}		
	}
	
	public static boolean validaCampo(char[][] matriz, int linha, int coluna){
		if (linha >= 0 && linha < (matriz.length)) {
			if (coluna >= 0 && coluna < (matriz[0].length)){
				return true;
			}
		}
		return false;
	}

	public static String converteArrayParaString(char[] array) {
        String palavraArray = new String(array);
        return palavraArray;
    }

	public static boolean comparaString (String string1, String string2){
		return (string1.equals(string2));
	}

	public String inverteString(String palavra){
		char[] vetor = palavra.toCharArray();
	    int inicio = 0;
	    int fim = vetor.length-1;
	    char temporario;
	    while(fim > inicio){
	        temporario = vetor[inicio];
	        vetor[inicio] = vetor[fim];
	        vetor[fim] = temporario;
	        fim--;
	        inicio++;
	    }
	    return converteArrayParaString(vetor);
	}


	public boolean procuraPorLinha(String palavra, char[] vetorPalavra, PalavraEncontrada palavraEncontrada){
		int contador = 0;		
		if (palavra.length() > this.tabuleiro.length) 
			return false;
		for (int i = 0; i < this.tabuleiro.length; i++){
			for (int j = 0; j < this.tabuleiro[0].length; j++){
				if (tabuleiro[i][j] == (palavra.charAt(0))){
					for (int k = j; k < (j + palavra.length()); k++){
						if (validaCampo(tabuleiro, i, k)){
							vetorPalavra[contador++] = tabuleiro[i][k];
						}
					}
					if (comparaString(palavra, converteArrayParaString(vetorPalavra))){
						palavraEncontrada.palavra = palavra;
						palavraEncontrada.posicao[0] = i;
						palavraEncontrada.posicao[1] = j;
						palavraEncontrada.tipo = 1;	
						return true;
					} else {
						contador = 0;	
					}
				}
			}
		}
		return false;
	}
	
	public boolean porLinhas(String palavra, char[] vetorPalavra, PalavraEncontrada palavraEncontrada){
		if (procuraPorLinha(palavra, vetorPalavra, palavraEncontrada)){
			palavraEncontrada.direcao = 1;			
			return true;
		}
		if (procuraPorLinha(inverteString(palavra), vetorPalavra, palavraEncontrada)){
			palavraEncontrada.direcao = 2;
			return true;
		}
		return false;

	}

	public boolean procuraPorColuna(String palavra, char[] vetorPalavra, PalavraEncontrada palavraEncontrada){
		int contador = 0;		
		if (palavra.length() > this.tabuleiro[0].length) 
			return false;
		for (int j = 0; j < this.tabuleiro[0].length; j++){
			for (int i = 0; i < this.tabuleiro.length; i++){
				if (tabuleiro[i][j] == (palavra.charAt(0))){
					for (int k = i; k < (i + palavra.length()); k++){
						if (validaCampo(tabuleiro, k, j)){
							vetorPalavra[contador++] = tabuleiro[k][j];
						}
					}
					if (comparaString(palavra, converteArrayParaString(vetorPalavra))){
						palavraEncontrada.palavra = palavra;
						palavraEncontrada.posicao[0] = i;
						palavraEncontrada.posicao[1] = j;
						palavraEncontrada.tipo = 2;	
						return true;
					} else {
						contador = 0;	
					}
				}
			}
		}
		return false;
	}
	
	public boolean porColunas(String palavra, char[] vetorPalavra, PalavraEncontrada palavraEncontrada){
		if (procuraPorColuna(palavra, vetorPalavra, palavraEncontrada)){
			palavraEncontrada.direcao = 1;			
			return true;
		}
		if (procuraPorColuna(inverteString(palavra), vetorPalavra, palavraEncontrada)){
			palavraEncontrada.direcao = 2;
			return true;
		}
		return false;
	}

	public static void printRightToLeftDiagonal(int[][] matrix) {
    int n = matrix.length;

    int j = n - 1;
    for (int i = 0; i < n; ++i) {
        printReverseDiagonal(matrix, i, j);
    }
        
    int i = n - 1;
    for(j = n - 2; j >= 0; --j) {
       printReverseDiagonal(matrix, i, j);
    }           
}

	private static void printReverseDiagonal(int[][] matrix, int i, int j) {
    System.out.print(matrix[i][j]);
    for (int row = i - 1, column = j - 1; row >= 0 && column >= 0; --row, --column) {
        System.out.print(" " + matrix[row][column]);
    }
    System.out.println();
}

    public boolean procuraPorAntiDiagonal(String palavra, char[] vetorPalavra, PalavraEncontrada palavraEncontrada){
    	int linhasDiagonal = (this.tabuleiro.length + this.tabuleiro[0].length) - 1;
   		int itensDiagonal = 0;
    	int meioPonto = (linhasDiagonal / 2) + 1;

    	for (int i = 1; i <= linhasDiagonal; i++) {
			int contador = 0;        	
			int indexLinha;
        	int indexColunas;
			if (palavra.length() > this.tabuleiro.length || palavra.length() > this.tabuleiro[0].length) 
				return false;
        	if (i <= meioPonto) {
            	itensDiagonal++;
            	for (int j = 0; j < itensDiagonal; j++) {
                	indexColunas = (i - j) - 1;
                	indexColunas = j;
                	vetorPalavra[contador++] = tabuleiro[i][j];
            	}
				if (comparaString(palavra, converteArrayParaString(vetorPalavra))){
					palavraEncontrada.palavra = palavra;
					palavraEncontrada.posicao[0] = i;
					palavraEncontrada.posicao[1] = j;
					palavraEncontrada.tipo = 3;	
					return true;
				} else {
					contador = 0;	
				}
       		} else {
            	itensDiagonal--;
            	for (int j = 0; j < itensDiagonal; j++) {
                	indexLinha = (this.tabuleiro.length - 1) - j;
                	indexColunas = (i - this.tabuleiro.length) + j;
					vetorPalavra[contador++] = tabuleiro[i][j];
            	}
				if (comparaString(palavra, converteArrayParaString(vetorPalavra))){
					palavraEncontrada.palavra = palavra;
					palavraEncontrada.posicao[0] = i;
					palavraEncontrada.posicao[1] = j;
					palavraEncontrada.tipo = 3;	
					return true;
				} else {
					contador = 0;	
				}
       	 	}
    	}
		return false;	
	}
	
	public boolean porDiagonais(String palavra, char[] vetorPalavra, PalavraEncontrada palavraEncontrada){
		if (procuraPorAntiDiagonal(palavra, vetorPalavra, palavraEncontrada)){
			palavraEncontrada.direcao = 1;			
			return true;
		}
		if (procuraPorAntiDiagonal(inverteString(palavra), vetorPalavra, palavraEncontrada)){
			palavraEncontrada.direcao = 2;
			return true;
		}
		return false;
	}


	public PalavraEncontrada buscar(String palavra){
		char[] vetorPalavra = new char[palavra.length()];
		PalavraEncontrada palavraEncontrada = new PalavraEncontrada();

		if (porLinhas(palavra, vetorPalavra, palavraEncontrada))
			return palavraEncontrada;
		if (porColunas(palavra, vetorPalavra, palavraEncontrada))
			return palavraEncontrada;	
		if (porDiagonais(palavra, vetorPalavra, palavraEncontrada))
		    return palavraEncontrada;
		return null;

	}

	public PalavraEncontrada[] buscar(String[] palavras){
	    int contador = 0;
	    PalavraEncontrada[] palavraEncontrada = new PalavraEncontrada[palavras.length];
		PalavraEncontrada retorno = new PalavraEncontrada();
	    
	    for (int i = 0; i < palavras.length; i++){
			retorno = buscar(palavras[i]);
	        if (retorno != null){
	           palavraEncontrada[contador] = new PalavraEncontrada();
	           palavraEncontrada[contador++] = retorno;
	        }     
	   }
	   if (palavraEncontrada[0] != null)
	        return palavraEncontrada;
	   return null;
	    
	}
}
