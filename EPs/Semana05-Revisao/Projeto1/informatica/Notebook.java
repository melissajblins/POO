package informatica;

public class Notebook extends Computador {

	private int nivelBateria = 0;

	public void carregarBateria(int tempo) {
		nivelBateria += tempo;
		if (nivelBateria >= 100)
			nivelBateria = 100;
	}
	
	public int getNivelBateria() {
		return this.nivelBateria;
	}
	
	@Override
	public String getTipo() {
		return "notebook";
	}
	
	public SuperComputador getNovoComputador() {
		return new SuperComputador();
	}

}