class Veiculo {
	Veiculo() {
		
	}
	
	public static Veiculo instanciar() {
		return new Veiculo();
	}
}

class Onibus extends Veiculo {
	
}

public class Programa {

	public static void main(String[] args) {
		Veiculo v1 = Veiculo.instanciar();
	}

}