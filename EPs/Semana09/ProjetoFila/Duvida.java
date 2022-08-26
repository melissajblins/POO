abstract class Duvida {
	private String texto;
	
	public Duvida(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Duvida=" + this.texto;
	}
}

class DuvidaFacil extends Duvida {
	public DuvidaFacil(String texto) {
		super(texto);
	}
}

class DuvidaDificil extends Duvida {
	public DuvidaDificil(String texto) {
		super(texto);
	}
}

class DuvidaMuitoDificil extends DuvidaDificil {
	public DuvidaMuitoDificil(String texto) {
		super(texto);
	}
}