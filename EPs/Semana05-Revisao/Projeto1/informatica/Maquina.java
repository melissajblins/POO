package informatica;

public abstract class Maquina {

	private String fabricante;
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getFabricante() {
		return this.fabricante;
	}
	
	public abstract String getTipo();

}