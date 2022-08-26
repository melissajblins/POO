package programa;

import estruturasdedados.ListaFacil;
import espaco.DiscoVoador;
import espaco.PortaDiscosVoadores;

public class TesteObjetos {

	public static void main(String[] args) {
		ListaFacil lista1 = new ListaFacil();
		DiscoVoador d1 = new DiscoVoador();
		//d1.estacionado = false;

		lista1.iniciaLista(2);
		
		lista1.adicionarItem(11);
		lista1.adicionarItem(22);
		lista1.adicionarItem(33);
		
		for (int i = 0; i < 3; i++)
			System.out.println(lista1.lerItem(i));
	}

}