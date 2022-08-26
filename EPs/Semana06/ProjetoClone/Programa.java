class ClasseTeste implements Cloneable {
	int n1 = 0;
	int n2 = 0;
	
	/*@Override
	public ClasseTeste clone() throws CloneNotSupportedException {
		ClasseTeste novaInstancia = new ClasseTeste();
		novaInstancia.n1 = this.n1;
		novaInstancia.n2 = this.n2;
		return novaInstancia;
	}*/
	
	@Override
	public ClasseTeste clone() throws CloneNotSupportedException {
		return (ClasseTeste) super.clone();
	}
}

public class Programa {
	public static void main(String[] args) {
		try {
			ClasseTeste c1 = new ClasseTeste();
			c1.n1 = 11;
			c1.n2 = 22;			
			ClasseTeste c2 = c1.clone();
			c2.n1 += 33;
			c2.n2 += 44;		
			
			System.out.println(
				String.format("n1=%d n2=%d", 
					c1.n1, c1.n2)
				);
			System.out.println(
				String.format("n1=%d n2=%d", 
					c2.n1, c2.n2)
				);
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
	}
	
}