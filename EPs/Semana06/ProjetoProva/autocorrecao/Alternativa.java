package autocorrecao;

public class Alternativa implements Cloneable {
	
	private String texto;
	
	public Alternativa(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	@Override
	public Alternativa clone() throws CloneNotSupportedException {
		return (Alternativa) super.clone();
	}
	
}