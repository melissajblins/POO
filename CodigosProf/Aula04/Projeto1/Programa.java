import universidade.Pessoa;
import universidade.Professor;

public class Programa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Pessoa1");
		
		//Professor prof1 = new Professor();
		Pessoa prof1 = new Professor();
		prof1.setNome("Professor1");
		
		System.out.println(p1.getNome());
		System.out.println(prof1.getNome());
				
		/*// Para testar toString()		
		System.out.println(p1);
		System.out.println(prof1);*/
	}

}