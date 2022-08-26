import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	public static void main(String [] args) {
		FilaDuvidas<DuvidaDificil> f1 = new FilaDuvidas<DuvidaDificil>("Programacao");
		
		f1.enfileirar(new DuvidaFacil("Quanto eh 2 + 2?"));
		f1.enfileirar(new DuvidaDificil("Quanto eh 3 x 3?"));
		f1.enfileirar(new DuvidaMuitoDificil("Qual eh a raiz quadrada de 3.14?"));
		
		System.out.println(f1.desenfileirar());
		System.out.println(f1.desenfileirar());
		System.out.println(f1.desenfileirar());
		System.out.println(f1.desenfileirar());
		
		
		
		/*f1.enfileirar("ABC");
		f1.enfileirar("DEF");
		f1.enfileirar("GHI");
		
		System.out.println(f1.desenfileirar());
		System.out.println(f1.desenfileirar());
		System.out.println(f1.desenfileirar());
		System.out.println(f1.desenfileirar());*/
	}
}