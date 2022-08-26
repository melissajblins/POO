public class Professor extends Pessoa {
	public Professor(String nome) {
		super(nome);
		System.out.println("Construtor em Professor (parametro nome)");
	}
	public Professor() {
		super();
		System.out.println("Construtor em Professor");
	}
}