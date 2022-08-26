package matematica;

public class Aula03EP02Fracoes{
	private int numerador;
	private int denominador;	

	public Fracao(){
		this.numerador = 1;
		this.denominador = 1;
	}	

	public Fracao(int numerador){
		this.numerador = numerador;
		this.denominador = 1;
	}

	public Fracao(int numerador, int denominador){
		int maximo_dividor = MDC(numerador, denominador);
		this.numerador = (numerador/maximo_dividor);
		this.denominador = (denominador/maximo_dividor);
	}
	
	public int getNumerador(){
		return this.numerador;
	}

	public int getDenominador(){
		return this.denominador;
	}

	public void setNumerador(int numerador){
		this.numerador = numerador;
	}

	public void setDenominador(int denominador){
		this.denominador = denominador;
	}
	
	public static int MDC(int numerador, int denominador){
    	if (denominador == 0){
			return numerador;
		} else {
			return MDC(denominador, (numerador % denominador));
    	}
	}
		
	public static Fracao somaFracao(Fracao f1, Fracao f2){
		Fracao soma = new Fracao();
		int numerador1 = 0;
		int numerador2 = 0;
	
		if (f1.getDenominador() == f2.getDenominador()){
		    soma.setNumerador(f1.getNumerador() + f2.getNumerador());
		    soma.setDenominador(f1.getDenominador());
		} else {
		    soma.setDenominador(f1.getDenominador() * f2.getDenominador());
		    numerador1 = ((soma.getDenominador()/ f1.getDenominador()) * f1.getNumerador());
		    numerador2 = ((soma.getDenominador() / f2.getDenominador()) * f2.getNumerador());
		    soma.setNumerador(numerador1 + numerador2); 
		}
		
		return soma;
	}

	public String getRepresentacao(){
	    int maximo_divisor = MDC(this.getNumerador(), this.getDenominador());
    	this.setNumerador((this.getNumerador()/maximo_divisor));
		this.setDenominador((this.getDenominador()/maximo_divisor));
		return String.format("%d/%d", this.numerador, this.denominador);
		
	}

	public Fracao somar(Fracao f2){
		Fracao f1 = new Fracao(this.getNumerador(), this.getDenominador()); 	
		return somaFracao(f1, f2);
	}
	
	public static Fracao somar(Fracao f1, Fracao f2){
		return somaFracao(f1, f2);
	}

	public static Fracao somar(Fracao[] fracoes) {
    	Fracao soma = new Fracao();
    	for (int i = 0; i < fracoes.length; i++){
        	if (i == 0){
            	soma.setNumerador(fracoes[i].getNumerador());
            	soma.setDenominador(fracoes[i].getDenominador());
        	} else {
				soma = somaFracao(soma, fracoes[i]);
        	}
    	}
    	return soma;
	}

	public static Fracao multiplicar(Fracao f1, Fracao f2) {
		Fracao multiplica = new Fracao();
		multiplica.setNumerador((f1.getNumerador() * f2.getNumerador()));
		multiplica.setDenominador((f1.getDenominador() * f2.getDenominador()));    

		int maximo_divisor = MDC(multiplica.getNumerador(), multiplica.getDenominador());
		multiplica.setNumerador((multiplica.getNumerador()/maximo_divisor));
		multiplica.setDenominador((multiplica.getDenominador()/maximo_divisor));

		return multiplica;
	}
}
