public class Pedido implements Comparable<Pedido> {

	private int qtdItens;
	private String endereco;
	
	public Pedido(int qtdItens, String endereco) {
		this.qtdItens = qtdItens;
		this.endereco = endereco;
	}
	
	public int getQtdItens() {
		return this.qtdItens;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	@Override
	public String toString() {
		return "Pedido:" + getQtdItens();
	}
	
	@Override
	public int compareTo(Pedido o) {
		return (this.getQtdItens() - o.getQtdItens());
	}
	
}