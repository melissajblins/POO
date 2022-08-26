import informatica.Maquina;
import informatica.Impressora;
//import informatica.Computador;
import informatica.Notebook;
import informatica.SuperComputador;

public class Programa {

	public static void main(String[] args) {
		Maquina[] v = new Maquina[3];
	
		Maquina maquina1 = new Impressora();
		Maquina maquina2 = new Notebook();
		Maquina maquina3 = new SuperComputador();
		v[0] = maquina1;
		v[1] = maquina2;
		v[2] = maquina3;
		
		maquina1.setFabricante("ABC");
		maquina2.setFabricante("DEF");
		maquina3.setFabricante("GHI");
		
		System.out.println(maquina1.getFabricante());
		System.out.println(maquina2.getFabricante());
		System.out.println(maquina3.getFabricante());
		
		System.out.println(v[0].getTipo());
		System.out.println(v[1].getTipo());
		System.out.println(v[2].getTipo());
	}

}