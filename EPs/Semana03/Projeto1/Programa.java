import universidade.Pessoa;
import universidade.Professor;

public class Programa {

	public static void main(String[] args) {
		/*Pessoa p1 = new Pessoa();
		p1.nome = "Pessoa1";*/
		//p1.setNome("Pessoa1");
		
		//Professor prof1 = new Professor();
		Professor prof1 = new Professor();
		prof1.nome = "Professor1";
		((Pessoa) prof1).nome = "OutroNome";
		//prof1.setNome("Professor1");
		
		/*System.out.println(p1.getNome());
		System.out.println(prof1.getNome());*/
		System.out.println(prof1.nome);
		System.out.println(((Pessoa)prof1).nome);
				
		/*// Para testar toString()		
		System.out.println(p1);
		System.out.println(prof1);*/
	}

}
