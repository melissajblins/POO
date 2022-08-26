public class Programa {

	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		Pessoa.setNome(p1, "Nome 1");
		Pessoa.setNome(p2, "Nome 2");
		
		System.out.println(p1.getNome());
		System.out.println(p2.getNome());
	
	}

}