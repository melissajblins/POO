public class Pessoa {
	private String nome;

	public Pessoa() {
		this("");
		System.out.println("Nome nao fornecido");
	}

	public Pessoa(String nome) {
		this.nome = nome;
		System.out.println("Nome fornecido");
	}

}