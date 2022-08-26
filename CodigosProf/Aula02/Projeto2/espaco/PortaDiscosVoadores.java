package espaco;

public class PortaDiscosVoadores{
	private DiscoVoador[] discos = new DiscoVoador[2];
	
	private int getIndiceLivre() {
		for (int i = 0; i < discos.length; i++)
			if (discos[i] == null)
				return i;
		return -1;
	}
	
	public void estacionarDisco(DiscoVoador disco) { 
		int indiceLivre = getIndiceLivre();
		if (indiceLivre < 0)
			System.out.println("Nao tem espaco.");
		else {
			discos[indiceLivre] = disco;
			disco.estacionado = true;
		}
	}
	
	public DiscoVoador liberarDisco(int indice) {
		DiscoVoador disco = discos[indice];
		discos[indice] = null;
		return disco;
	}
}