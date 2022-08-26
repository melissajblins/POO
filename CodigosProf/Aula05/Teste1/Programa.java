public class Programa {

	public static void main(String[] args) {
		Pessoa p1 = new Professor();
		Professor copia = (Professor) p1;
	
		System.out.println(p1.nome);
		System.out.println(((Professor)p1).nome);
		System.out.println(copia.nome);
		System.out.println(((Pessoa)copia).nome);
	}

}