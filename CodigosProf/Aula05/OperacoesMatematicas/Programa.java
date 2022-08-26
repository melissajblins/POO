public class Programa {
	
	public static void main(String[] args) {
		//IOperacao operacao1 = new Soma();
		IOperacao operacao1 = new Multiplicacao();
		
		System.out.println(String.format("%s: R = %.2f", 
				operacao1.getNomeOperacao(),
				operacao1.calcula(10, 20)
				)
			);
	}

}