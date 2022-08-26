public class Aula03EP01ContaCorrente{
	
	private String nome;
	private double saldo;
	private static int	quantidadeContas = 0;

	public ContaCorrente(String nome){
		this.nome = nome;
		this.saldo = 0;
		quantidadeContas++;
	}	

	public ContaCorrente(String nome, double saldo){
		this.nome = nome;
		this.saldo = saldo;
		quantidadeContas++;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public String getTitular(){
		return this.nome;
	}

	public boolean depositar(double valor){
		if (valor < 0)
			return false;
		else{
			this.saldo += valor;
			return true;
		}
	}

	public boolean sacar(double valor){
		if (valor < 0)
			return false;
		else if (this.saldo - valor < 0)
			return false;
		else{
			this.saldo -= valor;
			return true;
		}
	}

	public static boolean transferir(ContaCorrente de, ContaCorrente para, double valor){
		if (valor < 0 || de.getSaldo() < valor)
			return false;
		else{
			de.sacar(valor);
			para.depositar(valor);
			return true;
		}		
	}

	public static int getQuantidadeContas(){
		return quantidadeContas;
	}
}
